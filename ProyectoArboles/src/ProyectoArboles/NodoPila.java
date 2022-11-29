/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoArboles;

/**
 *
 * @author danieldangelo
 */
public class NodoPila {
    private NodoArbol dato;
    private NodoPila siguiente;
    
    public NodoPila(NodoArbol dato){
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * @return the dato
     */
    public NodoArbol getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(NodoArbol dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoPila getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}
