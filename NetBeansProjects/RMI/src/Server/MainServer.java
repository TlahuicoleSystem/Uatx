/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author josue-Asus
 */
public class MainServer {
    
    
    // lo que es que imprime en la terminal la  IP del cliente
    public void mensaje (String mensaje){
        System.out.println(mensaje);
    }
    
   
    public static void main(String args[]){
        try{
            Registry miRegistry = LocateRegistry.createRegistry(1234);
            miRegistry.rebind("Matematicas", (Remote) new ServerImplements());
            System.out.println("Servidor en linea");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
