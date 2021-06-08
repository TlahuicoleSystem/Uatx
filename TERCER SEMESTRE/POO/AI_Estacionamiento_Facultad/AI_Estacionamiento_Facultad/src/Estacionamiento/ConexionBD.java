/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamiento;

import java.sql.*;


public class ConexionBD {
        Connection con;
        Statement st;
        
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/estacionamientouatx","root","");//Hacemos conexion con la base
            System.out.println("Conección Exitosa a Base de Datos");
        } catch (Exception e) {
            System.err.println("Tienes un error,es este: "+e);
        }  
        return con;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }

}
