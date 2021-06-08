/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColasPrioridad;

/**
 *
 * @author Josue-Chuwi
 */
public class Nodo {
    Nodo previo,siguiente;
    int prioridad;
    String nombre;

    public Nodo(String i,int e) {//inicializar vatiable
        nombre = i;
        prioridad = e;
        siguiente = null;
        previo = null;
    }
}
