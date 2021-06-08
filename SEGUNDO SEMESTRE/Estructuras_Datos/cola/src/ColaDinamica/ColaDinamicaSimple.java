/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaDinamica;

/**
 *
 * @author Josue-Chuwi
 */
public class ColaDinamicaSimple {
        Nodo inicio, fin;

    public ColaDinamicaSimple() {
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
        } else {
            if (inicio == fin) {
                fin.siguiente = nodito;
                nodito.anterior = fin;
                fin = nodito;
            } else {
                fin.siguiente = nodito;
                nodito.anterior = fin;
                fin = nodito;
            }
        }
    }

    int pop() {
        int v = -1;
        if (estaVacia() == true) {
            System.out.println("Esta vacia");
            return v;
        } else {
            if (inicio == fin) {
                v = inicio.informacion;
                inicio = null;
                fin = null;
                return v;
            } else {
                v = inicio.informacion;
                inicio = inicio.siguiente;
                inicio.anterior.siguiente = null;
                inicio.anterior = null;
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
                for (auxiliar = inicio; auxiliar != fin; auxiliar = auxiliar.siguiente) {
                    System.out.println("El valor es" + auxiliar.informacion);
                }
                System.out.println("El valor es" + fin.informacion);
            }
        }
    }

    public static void main(String a[]) {
        ColaDinamicaSimple lista1 = new ColaDinamicaSimple();
        lista1.push(10);
        lista1.push(5);
        lista1.push(2);
        lista1.push(3);
        lista1.pop();
        lista1.pop();
        lista1.imprimir();
    }
}
