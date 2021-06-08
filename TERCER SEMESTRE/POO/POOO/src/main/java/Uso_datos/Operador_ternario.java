
package Uso_datos;

public class Operador_ternario {
    
     public static void main(String arg[]) {
        int x = 4, y = 9;
         x = ((y / x) < 3)? x + y : x * y ;
         System.out.println(x);
    }
}
    
