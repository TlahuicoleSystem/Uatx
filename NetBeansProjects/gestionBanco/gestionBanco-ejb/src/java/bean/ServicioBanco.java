/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;


import modelo.*;
/**
 *
 * @author josue-Asus
 */
@Stateless
public class ServicioBanco implements ServicioBancoLocal {

    private Banco miBanco=new Banco();

    public ServicioBanco() {
        miBanco.agregarCliente(new Cliente("1","Juan","Tlaxcala",new Cuenta("01",10)));
        miBanco.agregarCliente(new Cliente("2","Luis","Apizaco",new Cuenta("02",470)));
        miBanco.agregarCliente(new Cliente("3","Lupita","Cuapiaxtla",new Cuenta("03",980)));
        miBanco.agregarCliente(new Cliente("4","Daniela","Huamantla",new Cuenta("04",10000)));
    }
    
    

    @Override
    public void agregarCliente(String rut, String nombre, String ciudad, String codigo) {
        Cuenta cta=new Cuenta(codigo,0);
        Cliente cli=new Cliente(rut, nombre,ciudad,cta);
        miBanco.agregarCliente(cli);
        
    }

    @Override
    public Cliente buscarCliente(String rut) {
        return miBanco.buscarCliente(rut);
    }
}
