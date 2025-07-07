package Sistema;

import Modelo.Libro;
import Estructuras.ArbolBinarioBusqueda;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private ArbolBinarioBusqueda arbolLibros;

    public Biblioteca() {
        libros = new ArrayList<>();
        arbolLibros = new ArbolBinarioBusqueda();

        // libros juveniles
        libros.add(new Libro("Harry Potter y la pieda filosofal", "JK. Rolling", "Juvenil", "977-84-15580-97-2", true));
        libros.add(new Libro("La ladrona de libros", "Markus Zusak", "Juvenil", "978-84-15580-97-2", true));
        libros.add(new Libro("Percy Jackson y el ladrón del rayo", "Rick Riordan", "Juvenil", "978-84-450-7566-2", true));
        libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", "Juvenil", "978-84-675-8527-0", false));
        libros.add(new Libro("El corredor del laberinto", "James Dashner", "Juvenil", "978-84-15580-02-6", true));
        libros.add(new Libro("Bajo la misma estrella", "John Green", "Juvenil", "978-84-15580-34-7", false));

        // libros ciencia
        libros.add(new Libro("Breve historia del tiempo", "Stephen Hawking", "Ciencia", "978-84-450-7650-8", false));
        libros.add(new Libro("Cosmos", "Carl Sagan", "Ciencia", "978-84-206-6462-4", true));
        libros.add(new Libro("El gen egoísta", "Richard Dawkins", "Ciencia", "978-84-206-7659-7", true));
        libros.add(new Libro("La realidad oculta", "Brian Greene", "Ciencia", "978-84-460-3632-3", false));
        libros.add(new Libro("El universo en una cáscara de nuez", "Stephen Hawking", "Ciencia", "978-84-345-9286-3", true));

        // libros actualidad
        libros.add(new Libro("Sapiens", "Yuval Noah Harari", "Actualidad", "978-84-9066-319-0", false));
        libros.add(new Libro("21 lecciones para el siglo XXI", "Yuval Noah Harari", "Actualidad", "978-84-17217-67-2", true));
        libros.add(new Libro("El capital en el siglo XXI", "Thomas Piketty", "Actualidad", "978-84-15939-53-3", false));
        libros.add(new Libro("Cómo evitar un desastre climático", "Bill Gates", "Actualidad", "978-84-9992-912-0", true));
        libros.add(new Libro("Factfulness", "Hans Rosling", "Actualidad", "978-84-17241-71-4", true));

        // libros clásicos
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "Clásico", "978-84-376-0494-7", true));
        libros.add(new Libro("1984", "George Orwell", "Clásico", "978-84-206-5790-5", false));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "Clásico", "978-84-376-0495-4", true));
        libros.add(new Libro("Crimen y castigo", "Fiódor Dostoyevski", "Clásico", "978-84-376-2336-8", false));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Clásico", "978-84-376-0493-0", true));

        // Insertar libros al árbol
        for (Libro libro : libros) {
            arbolLibros.insertar(libro);
        }
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

    // 🔍 Búsqueda rápida por título usando el árbol binario
    public Libro buscarLibroPorTitulo(String titulo) {
        return arbolLibros.buscar(titulo);
    }
}
