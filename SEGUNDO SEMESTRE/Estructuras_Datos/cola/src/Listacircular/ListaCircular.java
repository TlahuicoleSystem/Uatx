/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listacircular;

/**
 *
 * @author Josue-Chuwi
 */
public class ListaCircular {

    Nodo inicio, fin;

    public ListaCircular() {
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

    void insertarEnfrente(int info) {
        Nodo nodito = new Nodo(info);//
        if (estaVacia() == true) {
            inicio = nodito;
            fin = nodito;//Fin=Inicio
            fin.siguiente = inicio;
        } else {
            if (inicio == fin) {
                nodito.siguiente = inicio;
                inicio = nodito;
                fin.siguiente = inicio;
            } else {
                nodito.siguiente = inicio;
                inicio = nodito;
                fin.siguiente = inicio;
            }
        }
    }

    void insertarAtras(int info) {
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

    void insertarEn(int e, int pos) {
        Nodo nodito = new Nodo(e);
        Nodo aux1, aux2;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es inalida");
        } else {
            if (estaVacia() == true) {
                inicio = nodito;
                fin = nodito;//Fin=Inicio}
                fin.siguiente = inicio;
            } else {
                if (pos == 1) {
                    nodito.siguiente = inicio;
                    inicio = nodito;
                    fin.siguiente = inicio;
                } else {

                    int contador = 1;
                    for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {

                        if (contador == pos) {
                            break;
                        }
                        contador++;
                    }
                    if (contador == pos) {
                        aux2 = aux1.siguiente;
                        nodito.siguiente = aux2;
                        aux1.siguiente = nodito;
                        fin.siguiente = inicio;

                    } else if (pos > contador) {
                        fin.siguiente = nodito;
                        fin = nodito;
                        fin.siguiente = inicio;
                    }
                }
            }
        }
    }

    int eliminarEnfrente() {
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
                Nodo aux;
                aux = inicio;
                inicio.siguiente = inicio;
                aux.siguiente = null;
                fin.siguiente = inicio;
                return v;
            }
        }
    }

    int eliminarAtras() {
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

    int eliminarEn(int pos) {
        Nodo aux1, aux2, aux3;
        int v = -1;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es inalida");

        } else {
            if (estaVacia() == true) {
                System.out.println("Lo sentimos la lista es vacia");

            } else {

                if (inicio == fin && pos == 1) {
                    v = inicio.informacion;
                    inicio = null;
                    fin = null;

                } else if (inicio != fin && pos == 1) {
                    v = inicio.informacion;
                    Nodo aux;
                    aux = inicio;
                    inicio.siguiente = inicio;
                    aux.siguiente = null;
                    fin.siguiente = inicio;
                    return v;

                } else {
                    int contador = 1;
                    for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {

                        if (contador == pos) {
                            v = aux1.informacion;
                            break;

                        }
                        contador++;
                    }

                    if (contador == pos) {
                        aux2 = aux1.siguiente;
                        aux3 = aux2.siguiente;
                        aux2.siguiente = null;
                        aux1.siguiente = aux3;
                        fin.siguiente = inicio;
                    } else {
                        aux1 = fin;
                        fin.siguiente = inicio;

                    }
                    if (pos > contador) {
                        System.out.println("Lo sentimos no existe la poscicion");

                    }
                }
            }
        }
        return v;
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
        ListaCircular lista1 = new ListaCircular();
        lista1.insertarEnfrente(9);
        lista1.insertarAtras(4);
        lista1.insertarAtras(6);
        lista1.insertarEn(5, 0);
        lista1.insertarEn(7, 1);
        lista1.eliminarAtras();
        lista1.eliminarEn(2);
        lista1.imprimir();
    }
}
