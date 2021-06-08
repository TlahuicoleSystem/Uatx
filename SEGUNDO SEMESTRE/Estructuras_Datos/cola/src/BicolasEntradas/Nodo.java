/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicolasEntradas;

/**
 *
 * @author Josue-Chuwi
 */
public class Nodo {
        int informacion;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int e) {//inicializar vatiable
        informacion = e;
        siguiente = null;
        anterior = null;
    }
}
