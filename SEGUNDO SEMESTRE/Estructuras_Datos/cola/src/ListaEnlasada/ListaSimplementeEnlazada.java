/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlasada;

/**
 *
 * @author Josue-Chuwi
 */
public class ListaSimplementeEnlazada {

    Nodo inicio, fin;

    public ListaSimplementeEnlazada() {
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
        } else {
            if (inicio == fin) {
                nodito.siguiente = inicio;
                inicio = nodito;
            } else {
                nodito.siguiente = inicio;
                inicio = nodito;
            }
        }
    }

    void insertarAtras(int info) {
        Nodo nodito = new Nodo(info);
        if (estaVacia() == true) {
            inicio = nodito;
            fin = nodito;//Fin=Inicio      
        } else {
            if (inicio == fin) {
                fin.siguiente = nodito;
                fin = nodito;
            } else {
                fin.siguiente = nodito;
                fin = nodito;
            }
        }

    }
    
     void insertarEn(int e, int pos){
        Nodo nodito = new Nodo(e);
        Nodo aux1, aux2;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es inalida");
        } else {
            if (estaVacia() == true) {
                inicio = nodito;
                fin = nodito;//Fin=Inicio
            } else {
                if (pos == 1) {
                    nodito.siguiente = inicio;
                inicio = nodito;
                } else {

                    int contador = 1;
                    for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {

                        if (contador == pos) {
                            break;
                        }
                        contador++;
                    }
                    if (contador == pos) {
                        aux2=aux1.siguiente;
                        nodito.siguiente=aux2;
                        aux1.siguiente = nodito;
                        
                        
                    } else if (pos > contador) {
                        fin.siguiente = nodito;
                        fin = nodito;
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
                fin.siguiente = null;
                return v;
            }
        }
    }
    
    int eliminarEn(int pos){
        Nodo aux1, aux2, aux3;
        int v=-1;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es invalida");
            
        } else {
            if (estaVacia() == true) {
                System.out.println("Lo sentimos la lista es vacia");
               
            } else {
                if (pos == 1) {
                v = inicio.informacion;
                Nodo aux;
                aux = inicio;
                inicio.siguiente = inicio;
                aux.siguiente = null;
                return v;
                
                }else 
                if (inicio == fin){
                v = inicio.informacion;
                inicio = null;
                fin = null;
                return v;
                }
                 else {
                    int contador = 1;
                    for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {

                        if (contador == pos) {
                            v = aux1.informacion;
                            break;
                            
                        }
                        contador++;
                    }
                    if (contador-- == pos) {
                        aux2 = aux1.siguiente;
                        aux3 = aux2.siguiente;
                        aux1.siguiente = aux3;
                        aux2.siguiente = null;
                        
                    } else if (pos > contador) {
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
                for (auxiliar = inicio; auxiliar != fin; auxiliar = auxiliar.siguiente) {
                    System.out.println("El valor es" + auxiliar.informacion);
                }
                System.out.println("El valor es" + fin.informacion);
            }
        }
    }
    public static void main(String a[]){
        ListaSimplementeEnlazada lista1=new ListaSimplementeEnlazada();
        lista1.insertarEn(5, 0);
        lista1.insertarEn(7, 1);
        lista1.insertarEn(2, 4);
        lista1.insertarEn(4, 5);
        lista1.insertarEn(10, 2);
        lista1.imprimir();
    }
}
