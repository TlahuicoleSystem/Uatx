/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColasPrioridad;

/**
 *
 * @author Josue-Chuwi
 */
public class ColaPrioridad {

Nodo inicio, fin;

    public ColaPrioridad() {
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

    void push(String no, int p) {
        Nodo nodito = new Nodo(no, p);
        if (estaVacia() == true && p > 0) {
            inicio = nodito;
            fin = nodito;
        } else if (nodito.prioridad >= inicio.prioridad) {
            nodito.siguiente = inicio;
            inicio.previo = nodito;
            inicio = nodito;
        } else if (nodito.prioridad <= fin.prioridad) {
            fin.siguiente = nodito;
            nodito.previo = fin;
            fin = nodito;
        } else {
            Nodo aux = inicio;
            for (aux = inicio; aux != fin; aux = aux.siguiente) {
                if(nodito.prioridad>aux.siguiente.prioridad){
                aux.siguiente.previo=nodito;
                nodito.siguiente=aux.siguiente;
                aux.siguiente=nodito;
                nodito.previo=aux;
                break;
            }
        }
    }
  }
    
       int pop(){//eliminarEnfrente
        int recuperacion = 0;
        if(estaVacia()==true){
            System.out.println("Error");
        }
        else if(inicio==fin){
            recuperacion=inicio.prioridad;
            inicio=null;
            fin=null;
        }
        else{
            recuperacion=inicio.prioridad;
            inicio=inicio.siguiente;
            inicio.previo.siguiente=null;
            inicio.previo=null;
        }
        return recuperacion;
    }

       
       int imprimir() {
        if (estaVacia() == true) {
            System.out.println("Error");
        } else{
            if (inicio == fin) {
                System.out.println("Los valores son "+inicio.nombre +" " + inicio.prioridad);
            }else{
                for (Nodo aux = inicio; aux != fin; aux=aux.siguiente) {
                System.out.println("Los valores son " + aux.nombre + " " + aux.prioridad);
                }
                System.out.println("Los valores son " +fin.nombre+ " " + fin.prioridad);
            }      
        }
        return 0;
    }
    
     public static void main(String arg[]) {
        ColaPrioridad lista = new ColaPrioridad();
        lista.push("Luis", 18);
        lista.push("Maria", 20);
        lista.push("Pablo", 25);
        lista.push("Pedro", 50);
        lista.push("John", 18);
        lista.push("Juan", 15);
        lista.imprimir();
        System.out.println("Dato eliminado" + lista.pop());
        lista.imprimir();
    }
}
