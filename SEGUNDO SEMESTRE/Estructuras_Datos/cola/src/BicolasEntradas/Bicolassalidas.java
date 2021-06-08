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
public class Bicolassalidas {
     Nodo inicio, fin;

    public Bicolassalidas() {
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
    int popEnfrente() {
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
    int popAtras() {
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
                fin = fin.anterior;
                fin.siguiente.anterior = null;
                fin.siguiente.siguiente = null;
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
        Bicolassalidas  lista1 = new Bicolassalidas ();
        lista1.push(10);
        lista1.push(6);
        lista1.push(2);
        lista1.push(4);
        lista1.imprimir();
        System.out.println("La eliminacion por atras "+lista1.popAtras());
        System.out.println("La eliminacion por adelnte "+lista1.popEnfrente());
        lista1.imprimir();
        lista1.imprimir();
    }
}
