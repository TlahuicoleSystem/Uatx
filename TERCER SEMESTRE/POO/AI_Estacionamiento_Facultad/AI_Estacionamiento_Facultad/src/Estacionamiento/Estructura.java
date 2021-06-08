/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Estructura {

    ArrayList<Vehiculo> vehiculos;
    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    public Estructura() {
        vehiculos = new ArrayList();
    }

    public String hora() {
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        String auxhora = Integer.toString(hora) + ":" + Integer.toString(minutos) + ":" + Integer.toString(segundos);
        return auxhora;
    }
    public String fecha(){
        String fecha;
        Calendar f = new GregorianCalendar();
        int dia = f.get(Calendar.DATE);
        int mes = f.get(Calendar.MONTH);
        int anio = f.get(Calendar.YEAR);
        //el mes inicia en 0 y le aumentamos uno para que coincida
        mes++;
        if(dia < 10){
           fecha  =  "0"+dia + "-"+mes+"-"+anio;
        }else{
            fecha  =  dia + "-"+mes+"-"+anio;
        }
      
        System.out.println(fecha);
        return fecha;
    }

    public void ingresarVehiculoRegistrado(int matricula, String area) {
        int auxfolio = -1, folio = -1, contador = -1;
        switch (area) {
            case "Estudiante":
                do {
                    auxfolio = (int) Math.floor(Math.random() * (53 - 36 + 1) + 36);
                    for (Vehiculo recorrido : vehiculos) {
                        if (auxfolio == recorrido.getFolio()) {
                            folio = auxfolio;
                        }
                    }
                    contador++;
                } while (auxfolio == folio && contador <= 18);
                if (contador >= 18) {
                    JOptionPane.showMessageDialog(null, "No hay espacio");
                } else {
                    vehiculos.add(new Vehiculo("", "", matricula, auxfolio, hora(), area));
                    JOptionPane.showMessageDialog(null, "ya entro y su cajon es: " + auxfolio);
                    Imagen abrir = new Imagen();
                    abrir.setVisible(true);
                }
                break;
            case "Personal":
                do {
                    auxfolio = (int) Math.floor(Math.random() * (29 - 1 + 1) + 1);
                    for (Vehiculo recorrido : vehiculos) {
                        if (auxfolio == recorrido.getFolio()) {
                            folio = auxfolio;
                        }
                    }
                    contador++;
                } while (auxfolio == folio && contador <= 29);
                if (contador >= 29) {
                    JOptionPane.showMessageDialog(null, "No hay espacio");
                } else {
                    vehiculos.add(new Vehiculo("", "", matricula, auxfolio, hora(), area));
                    JOptionPane.showMessageDialog(null, "ya entro y su cajon es " + auxfolio);
                    Imagen abrir = new Imagen();
                    abrir.setVisible(true);
                }
                break;
        }
    }

    public void ingresarVehiculoInvitado(String nombre, String placa) {
        int auxfolio = -1, folio = -1, contador = 0;
        do {
            auxfolio = (int) Math.floor(Math.random() * (35 - 30 + 1) + 30);
            for (Vehiculo recorrido : vehiculos) {
                if (auxfolio == recorrido.getFolio()) {
                    folio = auxfolio;
                }
            }
            contador++;
        } while (auxfolio == folio && contador <= 6);
        if (contador >= 6) {
            JOptionPane.showMessageDialog(null, "No hay espacio");
        } else {
            vehiculos.add(new Vehiculo(nombre, placa, 0, auxfolio, hora(), "Invitado"));
            JOptionPane.showMessageDialog(null, "ya entro y su cajon es " + auxfolio);
            Imagen abrir = new Imagen();
            abrir.setVisible(true);
        }
    }

    public String reporte() {
        String salida = "";
        for (Vehiculo recorrido : vehiculos) {
            salida = salida + recorrido.imprimir().concat("\n");
        }
        return salida;
    }

    public boolean verificar(int auxmatricula) {
        boolean matricula = false;
        int aux1matricula = -1;
        for (Vehiculo recorrido : vehiculos) {
            if (auxmatricula == recorrido.getMatricula()) {
                aux1matricula = recorrido.getMatricula();
            }
        }
        if (auxmatricula == aux1matricula) {
            matricula = true;
        } else {
            matricula = false;
        }

        System.out.println(matricula);
        return matricula;

    }

    public boolean verificarInvitado(String auxplaca) {
        boolean placa = false;
        String aux1placa="";
        for (Vehiculo recorrido : vehiculos) {
            if (auxplaca.equals(recorrido.getPlaca())) {
              aux1placa=recorrido.getPlaca();
            } 
        }
        if (auxplaca.equals(aux1placa)) {
                placa = true;
            } else {
                placa = false;
            }
        
        return placa;
    }

    public String salir(int folioSalida) {
        String salida = "",auxPlaca="",auxHoraEntrada="",auxOcupacion="",auxNombre="",auxHoraSalida="",auxFecha="",auxMatricula="";
        int indice=0,auxindice=0,auxFolioSalida=0;
        for (Vehiculo recorrido : vehiculos) {
            if (folioSalida == recorrido.getFolio()) {
                auxFolioSalida = recorrido.getFolio();
                salida = recorrido.imprimir();
                indice = auxindice;
                //A QUI RECUPERAMOS LOS DATOS 
                auxPlaca=recorrido.getPlaca();
                auxMatricula=Integer.toString(recorrido.getMatricula());
                auxHoraEntrada=recorrido.getHoraEntrada();
                auxOcupacion=recorrido.getArea();
                auxNombre=recorrido.getNombre();
                auxHoraSalida=hora();
                auxFecha=fecha();
                break;
            }
            auxindice++;
        }
        if (folioSalida == auxFolioSalida) {
            //INGRESAR DATOS A SQL
            
            try {
            // onvertimos la variable a string para poder mandarla
            String auxSFolioSalida=Integer.toString(auxFolioSalida);
            PreparedStatement act = cn.prepareStatement("INSERT INTO ingresoSalida(Ocupacion,Nombre,Placa,Matricula,Folio,Entrada,Salida,Fecha) VALUES (?,?,?,?,?,?,?,?)");
            act.setString(1, auxOcupacion);
            act.setString(2, auxNombre);
            act.setString(3, auxPlaca);
            act.setString(4, auxMatricula);
            act.setString(5, auxSFolioSalida);
            act.setString(6, auxHoraEntrada);
            act.setString(7, auxHoraSalida);
            act.setString(8, auxFecha);
            act.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Ocurrio algo en sql");
        }
            //BORRAR EL REGISTRO
            vehiculos.remove(indice);
            JOptionPane.showMessageDialog(null, "gracias por su visita");
        } else {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS EL AUTO NO ESTA");
        }
        return salida;
    }

}
