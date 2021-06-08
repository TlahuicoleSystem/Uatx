/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;


public class Vehiculo {

    private int matricula, folio;
    private String horaEntrada, area, placa, nombre;

    public Vehiculo(String nombre, String placa, int matricula, int folio, String horaEntrada, String area) {
        this.placa = placa;
        this.matricula = matricula;
        this.folio = folio;
        this.horaEntrada = horaEntrada;
        this.area = area;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String imprimir() {
        String mensaje = "";
        if (getArea().equals("Invitado")) {
            mensaje = "La placa es: ".concat(getPlaca()) + " El folio es: " + Integer.toString(getFolio()) + " La hora en la que entro es: " + getHoraEntrada() + " Su area es: " + getArea() + " EL nombre es " + getNombre();
        } else {
            mensaje = "La Matricula es: ".concat(Integer.toString(getMatricula())) + " El folio es: " + Integer.toString(getFolio()) + " La hora en la que entro es: " + getHoraEntrada() + " Su area es: " + getArea();
        }
        return mensaje;
    }
}
