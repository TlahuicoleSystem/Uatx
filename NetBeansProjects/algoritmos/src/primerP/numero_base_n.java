/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerP;

/**
 *
 * @author josue-Asus
 */
public class numero_base_n {

    public void calculos(int a, int b) {
        int resultado = a / b;
        int modulo = a % b;
        System.out.println("Resultado: " +resultado+" Modulo: " + modulo);
        if (resultado > 0){
            calculos (resultado,b);
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 2;
        numero_base_n prueba = new numero_base_n();
        prueba.calculos(a, b);
    }
}
