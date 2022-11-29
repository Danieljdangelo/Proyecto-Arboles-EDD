/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoArboles;

/**
 *
 * @author danieldangelo
 */
public class Arbol {
    NodoArbol raiz;
    Pila pila;
    
    public Arbol(NodoArbol raiz){
        this.raiz = raiz;
    }
    
    public Arbol(){
        this.raiz = null;
    }
}
