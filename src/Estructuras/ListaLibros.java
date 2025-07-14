package Estructuras;

import Modelo.Libro;

public class ListaLibros {
    private NodoLibro cabeza;

    public void agregar(Libro libro) {
        NodoLibro nuevo = new NodoLibro(libro);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLibro actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public NodoLibro getCabeza() {
        return cabeza;
    }

    public void recorrer() {
        NodoLibro actual = cabeza;
        while (actual != null) {
            System.out.println("📘 " + actual.libro.getTitulo());
            actual = actual.siguiente;
        }
    }
}
