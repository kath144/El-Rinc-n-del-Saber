
package Estructuras;

import Modelo.Libro;


public class ArbolBinarioBusqueda {
    private NodoArbol raiz;

    public void insertar(Libro libro) {
        raiz = insertarRecursivo(raiz, libro);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, Libro libro) {
        // ordena por título
        if (actual == null) return new NodoArbol(libro);

        if (libro.getTitulo().compareToIgnoreCase(actual.getLibro().getTitulo()) < 0)
            actual.izquierdo = insertarRecursivo(actual.izquierdo, libro);
        else
            actual.derecho = insertarRecursivo(actual.derecho, libro);

        return actual;
    }

    public Libro buscar(String titulo) {
        return buscarRecursivo(raiz, titulo);
    }

    private Libro buscarRecursivo(NodoArbol actual, String titulo) {
        if (actual == null) return null;

        int comparacion = titulo.compareToIgnoreCase(actual.getLibro().getTitulo());

        if (comparacion == 0)
            return actual.getLibro();
        else if (comparacion < 0)
            return buscarRecursivo(actual.izquierdo, titulo);
        else
            return buscarRecursivo(actual.derecho, titulo);
    }
}
