/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.util.ArrayList;

/**
 *
 * @author ESLY
 */
public class Memoria extends Instrucciones {

    int linea;
    ArrayList<Memoria> m = new ArrayList<>();

    public Memoria() {
        m.add(new Memoria());

    }

}
