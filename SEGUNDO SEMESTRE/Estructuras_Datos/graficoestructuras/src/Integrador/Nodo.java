/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

/**
 *
 * @author Josue-Chuwi
 */
public class Nodo {
    
    int longitud;
    float minuto;
    float hora;
    float orden;
    String placa, modelo, color;
    Nodo siguiente;
     Nodo previo;
    
    public Nodo(float h,float min,int l,String p,String m,String c) {
        hora = h;
        minuto = min;
        longitud = l;
        placa = p;
        modelo = m;
        color = c;
        
        siguiente = previo = null;
    }
}
