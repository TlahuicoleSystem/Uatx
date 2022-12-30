/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
/**
 *
 * @author josue-Asus
 */
public interface RemoteInterface extends Remote{
    public int suma(int a, int b, String IP)throws Exception;
    public int resta(int a, int b, String IP)throws Exception;
    public int div(int a, int b, String IP)throws Exception;
    public int mul(int a, int b, String IP)throws Exception;
    
}
