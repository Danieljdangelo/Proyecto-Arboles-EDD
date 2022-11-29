/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoArboles;

/**
 *
 * @author danieldangelo
 */
public class Pila {
    private NodoPila tope;
    
    public Pila(){
        this.tope = null;
    }    
    /**
     * Función que devuelve verdadero si la pila está vacía o false si la pila contiene elementos
     * @return boolean
     */
    public boolean EsVacia(){
        return tope == null;
    }
    /**
     * Método que recibe un dato de tipo NodoArbol y lo ingresa en la pila
     * @param NodoArbol elemento 
     */
    public void Insertar(NodoArbol elemento){
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.setSiguiente(tope);
        this.tope = nuevo;

    }
    /**
     * Función que retorna el dato del tope de la pila de tipo NodoArbol
     * @return NodoArbol dato
     */
    public NodoArbol RetornarTope(){
        return this.tope.getDato();
    }
    /**
     * Método que vacía la pila
     */
    public void ReiniciarPila(){
        tope = null;
    }
    /**
     * Función que saca un elemento de la pila y lo retorna
     * @return NodoArbol aux-
     */
    public NodoArbol Quitar(){
        NodoArbol aux = null;
        if(!this.EsVacia()){
            aux = tope.getDato();
            tope = tope.getSiguiente();
        }
        return aux;
    }
}
