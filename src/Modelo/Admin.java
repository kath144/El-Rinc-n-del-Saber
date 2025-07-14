package Modelo;

public class Admin {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String correo;

    public Admin(String correo, String contraseña, String nombre) {
    this.correo = correo;
    this.contraseña = contraseña;
    this.nombre = nombre;
    
}


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
