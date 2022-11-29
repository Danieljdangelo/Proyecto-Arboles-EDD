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
    
    /**
     * Constructor
     * Recibe una cadena y se la pasa como parametro a la función crear arbol que está mas abajo
     * @param cadena 
     */
    public Arbol(String cadena){
        this.raiz = CrearArbol(cadena);
    }
    
    /**
     * Función
     * Función que devuelve el apuntador a la raiz del objeto arbol
     * @return raiz
     */
    public NodoArbol getRaiz() {
        return raiz;
    }
    
    /**
     * Función
     * Funció que retorna verdadero si la raiz en null o falso si la raiz no es null
     * @return boolean
     */
    public boolean EsVacio(){
        return raiz == null;
    }
    
    /**
     * Función
     * Función que crea un nuevo nodo recibiendo un tipo de dato y le asigna la posición de raiz
     * @param dato 
     */
    public void CrearNodo(Object dato){
        this.raiz = new NodoArbol(dato);
    }
    
    /**
     * Función
     * Función que genera un subarbol a partir de 3 datos (el hijo derecho, el hijo izquierdo y la raiz del subarbol)
     * @param dato2
     * @param dato1
     * @param operador
     * @return NodoArbol operador (subarbol)
     */
    public NodoArbol CrearSubArbol(NodoArbol dato2, NodoArbol dato1, NodoArbol operador){
        operador.setIzquierdo(dato1);
        operador.setDerecho(dato2);
        return operador;
    }
    
    /**
     * Método
     * Operación que servirá para evaluar la entrada del usuario para revisar que tipo de expresión es
     * @param cadena 
     */
    public void EvaluarEntrada(String cadena){

    }
    
    /**
     * Función que recibe un entero y lo usa para devolver un String dependiendo del caso, cada caso corresponde a un recorrido distinto del arbol
     * @param a
     * @return String cadena
     */
    public String SelecRecorrido(int a){
        String cadena = "";
        switch(a){
            case 0:
                cadena = PreOrden(raiz, cadena);
                break;
            case 1:
                cadena = InOrden(raiz, cadena);
                break;
            case 2:
                cadena = PostOrden(raiz, cadena);
                break;
        }
        return cadena;
    }
    
    /**
     * Función que recibe un subarbol, lo recorre de forma preorden y devuelve una cadena que luego será mostrada en un label
     * @param subArbol
     * @param String c
     * @return String cadena
     */
    private String PreOrden(NodoArbol subArbol, String c){
        String cadena = "";
        if (subArbol != null){
            cadena = c + subArbol.getInfo().toString()+PreOrden(subArbol.getIzquierdo(), c) + PreOrden(subArbol.getDerecho(), c);
        }
        return cadena;
    }
    
    /**
     * Función que recibe un subarbol, lo recorre de forma inorden y devuelve una cadena que luego será mostrada en un label
     * @param subArbol
     * @param String c
     * @return String cadena
     */
    private String InOrden(NodoArbol subArbol, String c){
        String cadena = "";
        if(subArbol != null){
            cadena = c + InOrden(subArbol.getIzquierdo(), c) + subArbol.getInfo().toString() + InOrden(subArbol.getDerecho(), c);
        }
        return cadena;
    }
    
    /**
     * Función que recibe un subarbol, lo recorre de forma postorden y devuelve una cadena que luego será mostrada en un label
     * @param subArbol
     * @param String c
     * @return String cadena
     */
    private String PostOrden(NodoArbol subArbol, String c){
        String cadena = "";
        if(subArbol != null){
            cadena = c + PostOrden(subArbol.getIzquierdo(), c) + PostOrden(subArbol.getDerecho(), c) + subArbol.getInfo().toString();
        }
        return cadena;
    }
    
    /**
     * Función que recibe un dato de tipo char y devuelve la prioridad del del operador dependiendo del valor que posea, se usará para la creación del arbol con las pilas
     * @param char c
     * @return int p
     */
    private int PrioridadOperadores(char c){
        int p = 100;
        switch(c){
            case '^':
                p = 30;
                break;
            case '*':
            case '/':
                p = 20;
                break;
            case '+':
            case '-':
                p = 10;
                break;
            default:
                p = 0;
        }
        return p;
    }
    
    /**
     * Función que evalua si el caracter dado es un operador o no, si es operador devuelve true, de lo contrario, false
     * @param char c
     * @return boolean resultado
     */
    private boolean EsOperador(char c){
        boolean resultado;
        switch(c){
            case '(':
            case ')':
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
                resultado = true;
                break;
            default:
                resultado = false;
        }
        return resultado;
    }
    
    /**
     * Función que dada una cadena, crear el arbol. 
     * Crea dos pilas y unas variables de tipo NodoArbol, dependiendo de las evaluaciones hechas por las funciones anteriores.
     * va ingresando cada caracter de la cadena dada en la pila que corresponde (Operado u Operadores), luego de crear el arbol, devuelve el arbol en una variable de tipo NodoArbol
     * @param cadena
     * @return NodoArbol op (Arbol creado a partir de las pilas y las funciones de prioridad)
     */
    private NodoArbol CrearArbol(String cadena){
        Pila pilaOperadores = new Pila();
        Pila pilaExpresiones = new Pila();
        NodoArbol token;
        NodoArbol op1;
        NodoArbol op2;
        NodoArbol op;
        char caracterEvaluado;
        for (int i = 0; i <cadena.length(); i++) {
            caracterEvaluado = cadena.charAt(i);
            token = new NodoArbol(caracterEvaluado);
            if(!EsOperador(caracterEvaluado)){
                pilaExpresiones.Insertar(token);
            }
            else{
                switch(caracterEvaluado){
                        case '(':
                            pilaOperadores.Insertar(token);
                            break;
                        case ')':
                            while(!pilaOperadores.EsVacia() && !pilaOperadores.RetornarTope().getInfo().equals('(')){
                                op2 = pilaExpresiones.Quitar();
                                op1 = pilaExpresiones.Quitar();
                                op = pilaOperadores.Quitar();
                                op = CrearSubArbol(op2, op1, op);
                                pilaExpresiones.Insertar(op);
                            }
                            pilaOperadores.Quitar();
                            break;
                        default:
                            while(!pilaOperadores.EsVacia() && PrioridadOperadores(caracterEvaluado)<=PrioridadOperadores(pilaOperadores.RetornarTope().getInfo().toString().charAt(0))){
                                op2 = pilaExpresiones.Quitar();
                                op1 = pilaExpresiones.Quitar();
                                op = pilaOperadores.Quitar();
                                op = CrearSubArbol(op2, op1, op);
                                pilaExpresiones.Insertar(op);
                            }
                            pilaOperadores.Insertar(token);    
                }
            }
        }
        while(!pilaOperadores.EsVacia()){
            op2 = pilaExpresiones.Quitar();
            op1 = pilaExpresiones.Quitar();
            op = pilaOperadores.Quitar();
            op = CrearSubArbol(op2, op1, op);
            pilaExpresiones.Insertar(op);
        }
        op = pilaExpresiones.Quitar();
        return op;
    }
}
