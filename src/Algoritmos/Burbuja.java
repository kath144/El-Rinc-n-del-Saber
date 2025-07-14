package Algoritmos;

import Modelo.Libro;

public class Burbuja {

    public static void ordenarPorTitulo(Libro[] libros) {
        int n = libros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (libros[j].getTitulo().compareToIgnoreCase(libros[j + 1].getTitulo()) > 0) {
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
    }

    
}
