/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoArboles;

/**
 *
 * @author danieldangelo
 */
public class NodoArbol<T> {
    
    private T info;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    public NodoArbol(T info, NodoArbol izquierdo, NodoArbol derecho) {
        this.info = info;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    
    public NodoArbol(){
        this.info = null;
        this.derecho = null;
        this.izquierdo = null;
    }
    
    public NodoArbol(T info){
        this.info = info;
        this.derecho = null;
        this.izquierdo = null;
    }

    public NodoArbol(NodoArbol izquierdo, NodoArbol derecho) {
        this.info = null;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public NodoArbol(T info, NodoArbol derecho) {
        this.info = info;
        this.derecho = derecho;
        this.izquierdo = null;
    }
    
    public NodoArbol(NodoArbol izquierdo, T info){
        this.info = info;
        this.derecho = null;
        this.izquierdo = izquierdo;
    }

    /**
     * Getter
     * Funcion que devuelve el atributo info del nodo
     * @return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * Setter
     * Método que agrega el dato recibido como el atributo del objeto
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }

    /**
     * Funcion que devuelve el nodo del lado izquierdo al que apunta el objeto
     * @return the izquierdo
     */
    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    /**
     * Método que recibe un nodo y pone el objeto a apuntarlo del lado izquierdo
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * Funicón que devuelve el nodo del lado derecho al que apunta el objeto
     * @return the derecho
     */
    public NodoArbol getDerecho() {
        return derecho;
    }

    /**
     * Método que recibe un nodo y pone el objeto a apuntarlo del lado derecho
     * @param derecho the derecho to set
     */
    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }
}
