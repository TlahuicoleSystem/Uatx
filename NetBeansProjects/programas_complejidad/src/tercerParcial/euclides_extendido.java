/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercerParcial;

/**
 *
 * @author josue-Asus
 */
public class euclides_extendido {

    public static void main(String[] args) {
        System.out.println("t= 4, u =7 el resultado es: " + gcdetx(4, 7, 1, 0, 0));
        System.out.println("t= 24, u =35 el resultado es: " + gcdetx(24, 35, 1, 0, 0));
        System.out.println("t= 65, u =100 el resultado es: " + gcdetx(65, 100, 5, 0, 0));
        System.out.println("El inverso multiplicativo de 48 modulo 73 es: " + IminMultiplicativo(48, 73));
    }

    static int gcdetx(int n, int m, int g, int t, int u) {

        if (m == 0) {
            t = 1;
            u = 0;
            g = n;
            return n;
        } 
        int d = gcdetx(m, n % m, g, t, u);
        int s;
        s = u;
        t = s;
        u = t - (n / m) * u;
        return d;
    }

    public static int IminMultiplicativo(int n, int modulo) {
        int aux = 0;
        for (int i = 1; i <= n; i++) {
            inMultiplicativo(i, modulo);
            aux = i;
        }
        return inMultiplicativo(aux, modulo);
    }

    public static int inMultiplicativo(int a, int modulo) {
        a = a % modulo;
        for (int x = 1; x < modulo; x++) {
            if ((a * x) % modulo == 1) {
                return x;
            }
        }
        return -1;
    }

}
