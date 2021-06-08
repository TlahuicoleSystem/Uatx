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
public class BicolasEntradas {
    Nodo inicio, fin;

    public BicolasEntradas() {
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
    
        void pushEnfrente(int info) {
        Nodo nodito = new Nodo(info);//
        if (estaVacia() == true) {
            inicio = nodito;
            fin = nodito;//Fin=Inicio
            fin.siguiente = inicio;
            inicio.anterior = fin;
        } else {
            if (inicio == fin) {
                nodito.siguiente = inicio;
                inicio.anterior = nodito;
                inicio = nodito;
                fin.siguiente = inicio;
                inicio.anterior = fin;
            } else {
                nodito.siguiente = inicio;
                inicio.anterior = nodito;
                inicio = nodito;
                fin.siguiente = inicio;
                inicio.anterior = fin;
            }
        }
    }

    void pushAtras(int info) {
        Nodo nodito = new Nodo(info);
        if (estaVacia() == true) {
            inicio = nodito;
            fin = nodito;//Fin=Inicio  
            fin.siguiente = inicio;
            inicio.anterior = fin;
        } else {
            if (inicio == fin) {
                fin.siguiente = nodito;
                nodito.anterior = fin;
                fin = nodito;
                fin.siguiente = inicio;
                inicio.anterior = fin;
            } else {
                fin.siguiente = nodito;
                nodito.anterior = fin;
                fin = nodito;
                fin.siguiente = inicio;
                inicio.anterior = fin;
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
                fin.siguiente = inicio;
                inicio.anterior = fin;
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
        BicolasEntradas lista1 = new BicolasEntradas();
        lista1.pushEnfrente(10);
        lista1.pushEnfrente(5);
        lista1.pushAtras(4);
        lista1.imprimir();
        System.out.println(" la "+lista1.pop());
        lista1.imprimir();
    }
}
