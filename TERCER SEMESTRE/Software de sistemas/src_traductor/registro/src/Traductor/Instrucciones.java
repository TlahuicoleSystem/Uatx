/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traductor;

/**
 *
 * @author ESLY
 */
public class Instrucciones {

    String codigo;
    String instruccion;
    String registro1;
    String registro2;
    int longitud;

    public Instrucciones() {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public String getRegistro1() {
        return registro1;
    }

    public String getRegistro2() {
        return registro2;
    }

    public int getLongitud() {
        return longitud;
    }

    public Instrucciones(String codigo, String instruccion, String registro1, String registro2, int longitud) {
        
        this.codigo = codigo;
        this.instruccion = instruccion;
        this.registro1 = registro1;
        this.registro2 = registro2;
        this.longitud = longitud;
    }

    public void setRegistro1(String registro1) {
        this.registro1 = registro1;
    }

    public void setRegistro2(String registro2) {
        this.registro2 = registro2;
    }

    public void inicializar(String instruccion, String registro1, String registro2) {
        this.instruccion = instruccion;
        this.registro1 = registro1;
        this.registro2 = registro2;
    }



}
