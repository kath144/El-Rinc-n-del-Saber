package Sistema;

import Modelo.Admin;
import Estructuras.TablaHashAdmin;

public class AdminDAO {
    private TablaHashAdmin tablaAdmins;

    public AdminDAO() {
        tablaAdmins = new TablaHashAdmin();
        // Agregar un admin por defecto
        tablaAdmins.agregar(new Admin("admin@mail.com", "1234", "Administrador General"));
    }

    public boolean registrar(Admin admin) {
        return tablaAdmins.agregar(admin);
    }

    public boolean login(String correo, String contraseña) {
    return tablaAdmins.validar(correo, contraseña); // usa el método correcto
}


    public java.util.Collection<Admin> obtenerTodos() {
        return tablaAdmins.getTodos().values();
    }
}
