/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author josue-Asus
 */
public class Cuenta {
    private String codigo;
    private int saldo;
    
    public Cuenta(String codigo, int saldo){
        this.codigo=codigo;
        this.saldo=saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void depositar(int monto){
        if(monto>0){
            saldo+=monto;
        }
    
    }
    public void girar(int monto){
        if(saldo>=monto){
            saldo-=monto;
        }
    }
}
