/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerParcial;

import java.util.Random;

/**
 *
 * @author josue-Asus
 */
public class euclides_recursivo {

    public static void main(String[] args) {
        Random random = new Random();

        int i;
        for (i = 1; i <= 1000; i++) {
            int n = random.nextInt(1000 + 1) + 1;
            int m = random.nextInt(1000 + 1) + 1;
            System.out.println("EL resultado de la pareja (" + n + "," + m + ") es: " + obtener_mcd(n, m));
        }
    }

    static int obtener_mcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return obtener_mcd(m, n % m);
        }
    }

}
