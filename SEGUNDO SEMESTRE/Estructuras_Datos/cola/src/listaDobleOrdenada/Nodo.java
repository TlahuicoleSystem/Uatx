/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDobleOrdenada;

/**
 *
 * @author Josue-Chuwi
 */
public class Nodo {
    Nodo anterior,siguiente;
    int matricula, promedio;
    String nombre;

    public Nodo(String i,int m, int p) {//inicializar vatiable
        nombre = i;
        matricula = m;
        promedio = p;
        siguiente = null;
        anterior = null;
    }
}
