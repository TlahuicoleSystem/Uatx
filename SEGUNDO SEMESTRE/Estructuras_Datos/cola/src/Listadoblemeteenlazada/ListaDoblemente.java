/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listadoblemeteenlazada;

/**
 *
 * @author Josue-Chuwi
 */
public class ListaDoblemente {

    Nodo inicio, fin;

    public ListaDoblemente() {
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
                inicio.anterior = nodito;
                inicio = nodito;
            } else {
                nodito.siguiente = inicio;
                inicio.anterior = nodito;
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
                nodito.anterior = fin;
                fin = nodito;
            } else {
                fin.siguiente = nodito;
                nodito.anterior = fin;
                fin = nodito;
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
                fin = nodito;//Fin=Inicio
            } else {
                if (pos == 1) {
                    nodito.siguiente = inicio;
                    inicio.anterior = nodito;
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
                        aux2 = aux1.anterior;
                        aux2.siguiente = nodito;
                        nodito.siguiente = aux1;
                        nodito.anterior = aux2;
                        aux1.anterior = nodito;
                    } else if (pos > contador) {
                        fin.siguiente = nodito;
                        nodito.anterior = fin;
                        fin = nodito;
                    }
                }
            }
        }
    }
    int eliminarEn(int pos){
        Nodo aux1, aux2, aux3;
        int v=-1;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es inalida");
            
        } else {
            if (estaVacia() == true) {
                System.out.println("Lo sentimos la lista es vacia");
               
            } else {
                
                if (inicio == fin && pos == 1){
                v = inicio.informacion;
                inicio = null;
                fin = null;
                
                }
                else if (inicio != fin && pos == 1) {
                v = inicio.informacion;
                inicio = inicio.siguiente;
                inicio.anterior.siguiente = null;
                inicio.anterior = null;
                
                }
                 else {
                    int contador = 1;
                    for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {

                        if (contador == pos) {
                            
                            break;
                            
                        }
                        contador++;
                    }
                    if (contador == pos) {
                        v = aux1.informacion;
                        aux2 = aux1.anterior;
                        aux3 = aux1.siguiente;
                        aux2.siguiente = aux3;
                        aux3.anterior = aux2;   
                    } 
                    else {
                    v = fin.informacion;
                    fin = fin.anterior;
                    fin.siguiente.anterior = null;
                    fin.siguiente = null;
                    return v; 
                    } 
                            if (pos > contador) {
                        System.out.println("Lo sentimos no existe la poscicion");
                        
                        }
                }
            }
        }
        return v;
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
                inicio = inicio.siguiente;
                inicio.anterior.siguiente = null;
                inicio.anterior = null;
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
                fin = fin.anterior;
                fin.siguiente.anterior = null;
                fin.siguiente = null;
                return v;
            }
        }
    }

    void imprimirIzqDe() {
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

    void imprimirDeIzq() {
        if (estaVacia() == true) {
            System.out.println("Error la lista esta vacia");
        } else {
            if (inicio == fin) {
                System.out.println("El valor es" + inicio.informacion);
            } else {
                Nodo auxiliar;
                for (auxiliar = fin; auxiliar != inicio; auxiliar = auxiliar.anterior) {
                    System.out.println("El valor es" + auxiliar.informacion);
                }
                System.out.println("El valor es" + inicio.informacion);
            }
        }
    }

    public static void main(String a[]) {
        ListaDoblemente lista1 = new ListaDoblemente();
        lista1.insertarEn(4, 3);/*
        lista1.insertarEn(10, 1);
        lista1.insertarEn(1, 5);
        lista1.insertarEn(2, 3);*/
        lista1.imprimirIzqDe();
        System.out.println("Ahora a eliminar");
        System.out.println(lista1.eliminarEn(1));
        lista1.eliminarEn(0);
        lista1.eliminarEn(4);
        lista1.eliminarEn(2);
 
        lista1.imprimirIzqDe();
    }
}
