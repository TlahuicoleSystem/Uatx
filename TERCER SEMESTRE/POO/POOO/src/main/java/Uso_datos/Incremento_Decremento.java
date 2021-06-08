
package Uso_datos;


public class Incremento_Decremento {
    /*
    public static void main(String arg[]) {
        int contador = 15;
        int a, b, c, d;
        a=contador++;
        b=contador;
        c=++contador;
        d=contador++;
        System.out.println(a + ", " + b + ", " + c + ", "+ d );
    } */
    public static void main(String arg[]) {
        int contador = 15;
        int a, b, c, d, e;
        a=contador++;
        b=contador;
        c=++a;
        d=--b;
        e=b++ + ++d;
        System.out.println(a + ", " + b + ", " + c + ", "+ d + ", "+ e );
    }
}
