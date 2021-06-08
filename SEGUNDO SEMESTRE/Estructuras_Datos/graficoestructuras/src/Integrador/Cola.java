/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue-Chuwi
 */
public class Cola {

    Nodo inicio, fin;
    float horaentrada;
    float horasalida;

    boolean isEmpty() {
        return inicio == null && fin == null;
    }

    void push(float h, float min, int l, String p, String m, String c) {
        Nodo nodo = new Nodo(h, min, l, p, m, c);
        Nodo aux;
        float a;
        
        horaentrada = h + (min / 100);
        nodo.orden = nodo.hora + (nodo.minuto / 100);

        System.out.println(nodo.orden);

        if (isEmpty() == true && nodo.hora > 0) {
            inicio = nodo;
            fin = nodo;
        } else if (nodo.orden >= inicio.orden) {
            nodo.siguiente = inicio;
            inicio.previo = nodo;
            inicio = nodo;
        } else if (nodo.orden <= fin.orden) {
            fin.siguiente = nodo;
            nodo.previo = fin;
            fin = nodo;
        } else {
            for (aux = inicio; aux != fin; aux = aux.siguiente) {
                if (nodo.orden > aux.siguiente.orden) {
                    aux.siguiente.previo = nodo;
                    nodo.siguiente = aux.siguiente;
                    aux.siguiente = nodo;
                    nodo.previo = aux;
                    break;
                }
            }
        }
    }

    String pop(String matri, float horaa2, float minn) {
        Nodo aux1, aux2, aux3;
        String v = "";
        horasalida = horaa2 + (minn / 100);
        float precio;
        int precio2;
        if (isEmpty() == true) {
            System.out.println("Lo sentimos la lista es vacia");
            JOptionPane.showMessageDialog(null, "Lo sentimos la lista es vacia");
        } else {
            if (inicio.placa.equals(matri) && fin.placa.equals(matri)) {
                v = inicio.placa;
                inicio = null;
                fin = null;
                precio = 5 * (horasalida - horaentrada);
                precio2 = Math.round(precio);
                JOptionPane.showMessageDialog(null, "Muchas Gracias por visitarnos \n  El carro con la matricula: " + v + " Salio Correctamente\n El costo total es: " + precio2);
            } else {
                if (inicio.placa.equals(matri)) {
                    v = inicio.placa;
                    inicio = inicio.siguiente;
                        inicio.previo.siguiente  = null;
                       inicio.previo = null;
                    precio = 5 * (horasalida - horaentrada);
                    precio2 = Math.round(precio);
                    JOptionPane.showMessageDialog(null, "Muchas Gracias por visitarnos \n  El carro con la matricula: " + v + " Salio Correctamente\n El costo total es: " + precio2);
                } else {
                    if (fin.placa.equals(matri)) {
                        v = fin.placa;
                        fin = fin.previo;
                        fin.siguiente.previo = null;
                        fin.siguiente.siguiente = null;
                        fin.siguiente = inicio;
                        inicio.previo = fin;
                        precio = 5 * (horasalida - horaentrada);
                        precio2 = Math.round(precio);
                        JOptionPane.showMessageDialog(null, "Muchas Gracias por visitarnos \n  El carro con la matricula: " + v + " Salio Correctamente\n El costo total es: " + precio2);
                    } else {
                        for (aux1 = inicio; aux1 != fin; aux1 = aux1.siguiente) {
                            if (aux1.placa.equals(matri)) {
                                break;//si se cumple rompe el ciclo
                            }
                        }
                        if (aux1.placa.equals(matri)) {
                            v = aux1.placa;
                            aux2 = aux1.previo;
                            aux3 = aux1.siguiente;
                            aux1.previo = null;
                            aux1.siguiente = null;
                            aux2.siguiente = aux3;
                            aux3.previo = aux2;
                            precio = 5 * (horasalida - horaentrada);
                            precio2 = Math.round(precio);
                            JOptionPane.showMessageDialog(null, "Muchas Gracias por visitarnos \n  El carro con la matricula: " + v + " Salio Correctamente\n El costo total es: " + precio2);
                        } else {
                            JOptionPane.showMessageDialog(null, "Lo sentimos el carro no esta");
                        }
                    }
                }
            }
        }
        return v;
    }
}
