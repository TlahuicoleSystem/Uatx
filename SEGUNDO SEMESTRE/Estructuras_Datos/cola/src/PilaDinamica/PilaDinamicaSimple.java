/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilaDinamica;

/**
 *
 * @author Josue-Chuwi
 */
public class PilaDinamicaSimple {
        Nodo inicio, fin;

    public PilaDinamicaSimple() {
        inicio = null;
        fin = null;
    }

    boolean estaVacia() {
        if (inicio == null && fin == null) {
            return true;
        } else {
            return false;
        }
    }

    void push(int info) {
        Nodo nodito = new Nodo(info);
        if (estaVacia() == true) {
            inicio = nodito;
            fin = nodito;//Fin=Inicio  
            fin.siguiente = inicio;
        } else {
            if (inicio == fin) {
                fin.siguiente = nodito;
                fin = nodito;
                fin.siguiente = inicio;
            } else {
                fin.siguiente = nodito;
                fin = nodito;
                fin.siguiente = inicio;
            }
        }
    }

    int pop() {
        int v = -1;
        if (estaVacia() == true) {
            System.out.println("Error, esta vacia");
            return v;
        } else {
            if (inicio == fin) {
                v = fin.informacion;
                inicio = null;
                fin = null;
                return v;
            } else {
                v = fin.informacion;
                Nodo auxiliar;
                for (auxiliar = inicio; auxiliar.siguiente != fin; auxiliar = auxiliar.siguiente) {

                }
                fin = auxiliar;

                fin.siguiente = inicio;
                return v;
            }
        }
    }

    void imprimir() {
        if (estaVacia() == true) {
            System.out.println("Error la lista esta vacia");
        } else {
            if (inicio == fin) {
                System.out.println("El valor es" + inicio.informacion);
            } else {
                Nodo auxiliar;
                for (auxiliar = inicio; auxiliar.siguiente != inicio; auxiliar = auxiliar.siguiente) {
                    System.out.println("El valor es" + auxiliar.informacion);
                }
                System.out.println("El valor es" + fin.informacion);
            }
        }
    }
        public static void main(String a[]) {
        PilaDinamicaSimple lista1 = new PilaDinamicaSimple();
        lista1.push(5);
        lista1.push(7);
        lista1.push(10);
        lista1.pop();
        lista1.push(5);
        lista1.pop();
        lista1.imprimir();
    }
}
