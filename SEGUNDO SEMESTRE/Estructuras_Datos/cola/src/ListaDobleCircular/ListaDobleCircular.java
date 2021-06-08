package ListaDobleCircular;

public class ListaDobleCircular {

    Nodo inicio, fin;

    public ListaDobleCircular() {
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

    void insertarAtras(int info) {
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

    void insertarEn(int e, int pos) {
        Nodo nodito = new Nodo(e);
        Nodo aux1, aux2;
        if (pos <= 0) {
            System.out.println("Lo sentimos la posicion es inalida");
        } else {
            if (estaVacia() == true) {
                inicio = nodito;
                fin = nodito;//Fin=Inicio
                fin.siguiente = inicio;
                inicio.anterior = fin;
            } else {
                if (pos == 1) {
                    nodito.siguiente = inicio;
                    inicio.anterior = nodito;
                    inicio = nodito;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;
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
                        fin.siguiente = inicio;//creo que o es necesario
                        inicio.anterior = fin;
                    } else if (pos > contador) {
                        fin.siguiente = nodito;
                        nodito.anterior = fin;
                        fin = nodito;
                        fin.siguiente = inicio;
                        inicio.anterior = fin;
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
                inicio = inicio.siguiente;
                inicio.anterior.siguiente = null;
                inicio.anterior = null;
                fin.siguiente = inicio;
                inicio.anterior = fin;
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
                    inicio = inicio.siguiente;
                    inicio.anterior.siguiente = null;
                    inicio.anterior.anterior = null;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;

                } else {
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
                        aux1.anterior=null;
                        aux1.siguiente=null;
                        aux2.siguiente = aux3;
                        aux3.anterior = aux2;
                        
                    } else {
                        v = fin.informacion;
                        fin = fin.anterior;
                        fin.siguiente.anterior = null;
                        fin.siguiente.siguiente = null;
                        fin.siguiente = inicio;
                        inicio.anterior = fin;
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
                fin.siguiente.siguiente = null;
                fin.siguiente = inicio;
                inicio.anterior = fin;
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
        ListaDobleCircular lista1 = new ListaDobleCircular();
        System.out.println("La Lista esta Vacia? " + lista1.estaVacia());
        lista1.insertarEnfrente(10);
        lista1.insertarEn(50, 1);
        lista1.insertarEn(40, 1);
        lista1.insertarEn(4, 2);
        lista1.insertarAtras(3);
        lista1.insertarAtras(2);
        lista1.eliminarEnfrente();
        lista1.eliminarEn(2);
        lista1.eliminarAtras();
        System.out.println("La Lista esta Vacia? " + lista1.estaVacia());
        lista1.imprimirDeIzq();
        System.out.println("Impresion de izquierda a derecha");
        lista1.imprimirIzqDe();

    }
}
