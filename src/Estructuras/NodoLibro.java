package Estructuras;

import Modelo.Libro;

public class NodoLibro {
    public Libro libro;
    public NodoLibro siguiente;

    public NodoLibro(Libro libro) {
        this.libro = libro;
        this.siguiente = null;
    }
}
