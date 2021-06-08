
package arbol1;


public class Nodo {
    //CREAMOS LAS VARIABLES DE TIPO NODO
    int info;
    Nodo izquierda, derecha;

    public Nodo(int i) {//EN ESTA FUNCION INICIALIZAMOS LAS VARIABLES 
        izquierda = derecha = null;
        info = i;//INFO ES IGUAL AL DATO QUE INGRESA 
    }
}
