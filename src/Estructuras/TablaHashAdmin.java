package Estructuras;

import Modelo.Admin;
import java.util.HashMap;

public class TablaHashAdmin {
    private HashMap<String, Admin> tabla;

    public TablaHashAdmin() {
        tabla = new HashMap<>();
    }

    public boolean agregar(Admin admin) {
    if (tabla.containsKey(admin.getCorreo())) return false;
    tabla.put(admin.getCorreo(), admin);
    return true;
}

    public Admin buscar(String correo) {
        return tabla.get(correo);
    }

    public boolean validar(String correo, String contraseña) {
    Admin admin = buscar(correo); 
    return admin != null && admin.getContraseña().equals(contraseña);
}


    public HashMap<String, Admin> getTodos() {
        return tabla;
    }
}
