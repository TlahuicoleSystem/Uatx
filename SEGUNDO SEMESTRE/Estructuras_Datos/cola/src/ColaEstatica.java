/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue-Chuwi
 */
public class ColaEstatica {

    int colaEstatica[];//Declaracion de arreglo
    int capacidad, ap;

    void inicializar(int cap) {
        capacidad = cap;
        colaEstatica = new int[capacidad];
        ap = 0;
    }

    boolean estaVacia() {
        if (ap == 0){
            return true;
        }else{
            return false;
        }
    }

    boolean estaLlena() {
        if (ap == capacidad) {
            return true;
        } else {
            return false;
        }
    }

    void push(int e) {//Meter
        if (estaLlena() == false) {
            colaEstatica[ap] = e;
            ap++;
        } else {
            System.out.println("Underflow");
        }
    }

    int pop() {
        int valor_recuperado;
        if (estaVacia() == false) {
            valor_recuperado = colaEstatica[0];
            for (int i = 0; i < ap; i++) {
                colaEstatica[i] = colaEstatica[i + 1];
            }
            ap--;
            return valor_recuperado;
        } else {
            System.out.println("Desbosdamiento inferior!");
            return 0;
        }
    }

    void imprimir() {
        int i;
        for (i = 0; i < ap; i++) {
            System.out.println(colaEstatica[i]);
        }
        System.out.println();
    }

    public static void main(String ww[]) {
        ColaEstatica prueba1 = new ColaEstatica();
        prueba1.inicializar(5);
        prueba1.push(7);
        prueba1.imprimir();
        prueba1.push(19);
        prueba1.imprimir();
        System.out.println("¿Esta Vacia la pila? " + prueba1.estaVacia());
        System.out.println("¿Esta llena la pila? " + prueba1.estaLlena());
        System.out.println("El valor recuperado es " + prueba1.pop());
        prueba1.imprimir();
        System.out.println("El valor recuperado es " + prueba1.pop());
        prueba1.imprimir();
        prueba1.push(7);
        prueba1.imprimir();
        System.out.println("El valor recuperado es " + prueba1.pop());
        prueba1.imprimir();
        prueba1.push(9);
        prueba1.imprimir();
        prueba1.push(2);
        prueba1.imprimir();
        prueba1.push(10);
        prueba1.imprimir();
        System.out.println("¿Esta llena la pila? " + prueba1.estaLlena());
        prueba1.push(3);
        prueba1.imprimir();
    }
}
