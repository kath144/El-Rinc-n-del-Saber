package Modelo;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String categoria, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }
    public String getIsbn() { return isbn; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
