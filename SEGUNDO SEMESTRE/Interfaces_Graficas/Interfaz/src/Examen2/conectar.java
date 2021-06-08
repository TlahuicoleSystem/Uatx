/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Josue-Chuwi
 */
public class conectar {
        Connection conectar = null;
    public Connection conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost/examen", "root", "");    
    }catch (Exception e){
        System.out.println("Fallo la conexion");
    }
    return conectar;
    }
}
