
package Estructuras;

import Modelo.Libro;

public class NodoArbol {
    private Libro libro;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(Libro libro) {
        this.libro = libro;
        this.izquierdo = null;
        this.derecho = null;
    }

    public Libro getLibro() {
        return libro;
    }
}