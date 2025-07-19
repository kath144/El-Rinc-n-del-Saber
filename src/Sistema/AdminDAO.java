package Sistema;

import Modelo.Admin;
import Estructuras.TablaHashAdmin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminDAO {
    private TablaHashAdmin tablaAdmins;

    public AdminDAO() {
    tablaAdmins = new TablaHashAdmin();
    cargarDesdeArchivo();

    if (tablaAdmins.buscar("admin@gmail.com") == null) {
        tablaAdmins.agregar(new Admin("admin@gmail.com", "1234", "Administrador General"));
        guardarEnArchivo();
    }
}
    public boolean login(String correo, String contraseña) {
    return tablaAdmins.validar(correo, contraseña);
}


    public java.util.Collection<Admin> obtenerTodos() {
        return tablaAdmins.getTodos().values();
    }

    public boolean registrar(Admin admin) {
    boolean exito = tablaAdmins.agregar(admin);
    if (exito) {
        System.out.println("Admin registrado: " + admin.getCorreo());
        guardarEnArchivo();
    } else {
        System.out.println("Admin ya existe: " + admin.getCorreo());
    }
    return exito;
}
    public void cargarDesdeArchivo() {
    try (BufferedReader reader = new BufferedReader(new FileReader("admins.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] partes = linea.split(";");
            if (partes.length == 3) {
                String correo = partes[0];
                String contraseña = partes[1];
                String nombre = partes[2];
                Admin admin = new Admin(correo, contraseña, nombre);
                tablaAdmins.agregar(admin);
            }
        }
        System.out.println(" Datos cargados desde admins.txt");
    } catch (IOException e) {
        System.out.println(" No se pudo cargar admins.txt ");
    }
}

    public void guardarEnArchivo() {
    try {
        File archivo = new File("admins.txt");
        if (!archivo.exists()) {
            boolean creado = archivo.createNewFile();
            if (creado) {
                System.out.println("Archivo admins.txt creado correctamente.");
            } else {
                System.out.println("No se pudo crear el archivo admins.txt");
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            for (Admin admin : tablaAdmins.getTodos().values()) {
                writer.println(admin.getCorreo() + ";" +
                               admin.getContraseña() + ";" +
                               admin.getNombre() );
            }
        }

        System.out.println(" Datos guardados en admins.txt");

    } catch (IOException e) {
        System.out.println("Error al guardar en admins.txt");
        e.printStackTrace();
    }
}



}
