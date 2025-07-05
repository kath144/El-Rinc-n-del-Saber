package Sistema;

import Modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();

        libros.add(new Libro("La ladrona de libros", "Markus Zusak", "Juvenil", "978-84-15580-97-2", true));
        libros.add(new Libro("El universo en una cáscara de nuez", "Stephen Hawking", "Ciencia", "978-84-345-9286-3", true));
        libros.add(new Libro("Sapiens", "Yuval Noah Harari", "Actualidad", "978-84-9066-319-0", false));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "Clásico", "978-84-376-0494-7", true));
        libros.add(new Libro("1984", "George Orwell", "Clásico", "978-84-206-5790-5", false));
    }

    public List<Libro> getLibrosPorCategoria(String categoria) {
        List<Libro> filtrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (categoria.equals("Todos") || libro.getCategoria().equalsIgnoreCase(categoria)) {
                filtrados.add(libro);
            }
        }
        return filtrados;
    }
}
