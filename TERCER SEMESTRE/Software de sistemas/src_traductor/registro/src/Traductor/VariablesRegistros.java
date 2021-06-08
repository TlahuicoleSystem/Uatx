/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.util.ArrayList;
/**
 *
 * @author Josue-Chuwi
 */
public class VariablesRegistros {

    String registroDestino;
    String registroOrigen;
    int longitud;
    ArrayList<VariablesRegistros> vr = new ArrayList<>();

    VariablesRegistros() {
        vr.add(new VariablesRegistros("", "AX", 2));
        vr.add(new VariablesRegistros("AX", "", 1));
        vr.add(new VariablesRegistros("BX", "", 1));
        vr.add(new VariablesRegistros("CX", "", 1));
        vr.add(new VariablesRegistros("DX", "BX", 1));
        vr.add(new VariablesRegistros("AX", "BX", 1));
        vr.add(new VariablesRegistros("CX", "DX", 1));
        vr.add(new VariablesRegistros("CX", "AX", 1));
        vr.add(new VariablesRegistros("AX", "", 2));
        vr.add(new VariablesRegistros("CX", "", 2));
        vr.add(new VariablesRegistros("AX", "", 1));
        vr.add(new VariablesRegistros("BX", "", 1));
        vr.add(new VariablesRegistros("CX", "", 2));
    }

    public void añadir(String registro1, String registro2, int longitud) {
        VariablesRegistros l = new VariablesRegistros(registro1, registro2, longitud);

        vr.add(l);

    }

    public void imprimir() {
        System.out.println("Nombre:\tValor:\tLongitud");
        for (VariablesRegistros v : vr) {
            System.out.println(v.registroDestino + "\t" + v.registroOrigen + "\t" + v.longitud);
        }

    }

    public VariablesRegistros(String registroDestino, String registroOrigen, int longitud) {
        this.registroDestino = registroDestino;
        this.registroOrigen = registroOrigen;
        this.longitud = longitud;
    }


    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setRegistroDestino(String registroDestino) {
        this.registroDestino = registroDestino;
    }

    public void setRegistroOrigen(String registroOrigen) {
        this.registroOrigen = registroOrigen;
    }

    public void setVr(ArrayList<VariablesRegistros> vr) {
        this.vr = vr;
    }

    public int getLongitud() {
        return longitud;
    }

}
