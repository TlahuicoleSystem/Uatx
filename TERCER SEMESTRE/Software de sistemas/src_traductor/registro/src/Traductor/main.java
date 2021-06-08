/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

import java.io.PrintWriter;

public class main {

    public static void main(String[] args) {
        //Las funciones estan en clases Archivos, por lo que se crea objeto a
        Archivos a = new Archivos();

        //leer txt
        String txt = a.leerArchivo("D:\\aritmeticaBasica.txt");

        //funcion variables para imprimir variables
        a.buscarV(txt);
        System.out.println("");

        //funcion instrucciones para imprimir instrucciones y tabla de etiquetas
        a.instrucciones(txt);
        //a.tablaCodigos();

        a.generarArchivo("aritmetica");

    }

}
