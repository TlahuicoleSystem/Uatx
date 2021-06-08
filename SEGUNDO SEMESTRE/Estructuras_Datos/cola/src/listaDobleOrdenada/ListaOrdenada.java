package listaDobleOrdenada;

public class ListaOrdenada {

    Nodo inicio, fin;

    public ListaOrdenada() {
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

    void insertarEnfrente(String nombre, int p, int m) {
        Nodo nodito = new Nodo(nombre, p, m);//Creacion del nodo
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

    void insertarAtras(String nombre, int p, int m) {
        Nodo nodito = new Nodo(nombre, p, m);//Creacion del nodo
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

    void insertarEn(String nombre, int p, int m, int pos) {
        Nodo nodito = new Nodo(nombre, p, m);//Creacion del nodo
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

    void ordenar() {
        if (estaVacia() == true) {
            System.out.println("Lista Vacia");
        } else {
            if (inicio == fin) {
                System.out.println("Unico nodo");
            } else {
                for (Nodo aux = inicio; aux != null; aux = aux.siguiente) {
                    for (Nodo aux1 = aux; aux1 != null; aux1 = aux1.siguiente) {
                        if (aux.promedio < aux1.promedio) {
                            Nodo aux2 = aux;
                            aux = aux1;
                            aux1 = aux2;
                        }
                    }
                }
            }
        }
    }

    void imprimirIzqDe() {
        if (estaVacia() == true) {
            System.out.println("Error la lista esta vacia");
        } else {
            if (inicio == fin) {
                System.out.println("El valor es " + inicio.nombre + " " + inicio.matricula + " " + inicio.promedio);
            } else {
                Nodo auxiliar;
                for (auxiliar = inicio; auxiliar != fin; auxiliar = auxiliar.siguiente) {
                    System.out.println("El valor es " + auxiliar.nombre + " " + auxiliar.matricula + " " + auxiliar.promedio);
                }
                System.out.println("El valor es " + fin.nombre + " " + fin.matricula + " " + fin.promedio);
            }
        }
    }

    public static void main(String arg[]) {
        ListaOrdenada lista = new ListaOrdenada();
        lista.insertarEnfrente("josue", 9, 2019);
        lista.insertarEnfrente("pablo", 10, 2015);
        lista.insertarEnfrente("sam", 5, 2014);
        lista.imprimirIzqDe();
        lista.ordenar();
        lista.imprimirIzqDe();
    }
}
