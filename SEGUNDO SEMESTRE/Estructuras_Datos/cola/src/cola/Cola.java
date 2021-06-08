/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

/**
 *
 * @author Josue-Chuwi
 */
public class Cola {
    int pilaEstatica[];//Declaracion de arreglo
    int capacidad,ap;

    void inicializar(int cap){
        capacidad=cap;
        pilaEstatica=new int [capacidad];
        ap=0;
    }
    boolean estaVacia(){
        if(ap==0)
            return true;
        else
            return false;
    }
    boolean estaLlena(){
        if(ap==capacidad)
            return true;
        else
            return false;
    }
    void push(int e){//Meter
        if(estaLlena()==false){
            pilaEstatica[ap]=e;
            ap++;
        }else{
            System.out.println("Underflow");
        }
    }
    int pop(){//sacar
    int aux;
        if(estaVacia()==false){
            ap--;
            aux=pilaEstatica[ap];
            pilaEstatica[ap]=0;
            return aux;
        }else{
            System.out.println("Overflow");
        }
        return 0;
    }
    void imprimir(){
        int i;
        for(i=0;i<ap;i++){
            System.out.println(pilaEstatica[i]);
        }
        System.out.println();
    }
    public static void main(String ww[]){
        Cola prueba1=new Cola();
        prueba1.inicializar(4);
        System.out.println("¿Esta vacia la pila? "+prueba1.estaVacia());
        prueba1.pop();
        prueba1.push(50);
        prueba1.imprimir();
        prueba1.push(20);
        prueba1.push(30);
        prueba1.push(40);
        prueba1.imprimir();
        prueba1.push(7);
        prueba1.imprimir();
        System.out.println("¿Esta llena la pila? "+prueba1.estaLlena());
    
    }
}