/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import RMI.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author josue-Asus
 */
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{
    
     
    public ServerImplements() throws Exception{
        super();
    }
     
    @Override
    public int suma (int a, int b, String IP){
        int resultado = a + b ;
        String mensaje = "La IP del cliente es: " + IP + " Dato1: "+a+" Dato 2: " +b+" El resultado de la suma es: "+ resultado;
        MainServer objeto = new MainServer();
        objeto.mensaje(mensaje);
        return resultado;
    }
    
    public int resta (int a, int b, String IP){
        int resultado = a - b ;
        String mensaje = "La IP del cliente es: " + IP + " Dato1: "+a+" Dato 2: " +b+" El resultado de la restas es: "+ resultado;
        MainServer objeto = new MainServer();
        objeto.mensaje(mensaje);
        return resultado;
    }
    
    public int div (int a, int b, String IP){
        int resultado = a / b ;
        String mensaje = "La IP del cliente es: " + IP + " Dato1: "+a+" Dato 2: " +b+" El resultado de la division es: "+ resultado;
        MainServer objeto = new MainServer();
        objeto.mensaje(mensaje);
        return resultado;
    }
    
    public int mul (int a, int b, String IP){
        int resultado = a * b ;
        String mensaje = "La IP del cliente es: " + IP + " Dato1: "+a+" Dato 2: " +b+" El resultado de la multiplicacion es: "+ resultado;;
        MainServer objeto = new MainServer();
        objeto.mensaje(mensaje);
        return resultado;
    }
}
