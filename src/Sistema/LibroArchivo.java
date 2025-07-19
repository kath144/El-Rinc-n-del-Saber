package Sistema;

import Modelo.Libro;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibroArchivo {
    private static final String ARCHIVO = "libros.txt";

    public static void guardarLibros(List<Libro> libros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Libro libro : libros) {
                String linea = libro.getTitulo() + "|" + libro.getAutor() + "|" + libro.getCategoria() + "|" +
                               libro.getIsbn() + "|" + libro.isDisponible();
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Libro> cargarLibros() {
        List<Libro> libros = new ArrayList<>();
        File archivo = new File(ARCHIVO);

        if (!archivo.exists()) return libros;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 5) {
                    String titulo = partes[0];
                    String autor = partes[1];
                    String categoria = partes[2];
                    String isbn = partes[3];
                    boolean disponible = Boolean.parseBoolean(partes[4]);
                    libros.add(new Libro(titulo, autor, categoria, isbn, disponible));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return libros;
    }
}
