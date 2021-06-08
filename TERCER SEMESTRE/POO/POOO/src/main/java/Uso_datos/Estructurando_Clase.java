
package Uso_datos;

import java.util.Scanner;

public class Estructurando_Clase {
    private String descripcion,color;
    double precio;
    
    private Estructurando_Clase(){
        descripcion = "";
        color = "";
        precio=0.0;
    }
    
    private void guardar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el color");
        color = entrada.nextLine();
        System.out.println("Ingrese la descripcion");
        descripcion = entrada.nextLine();
        System.out.println("Ingrese el precio");
        precio = entrada.nextDouble();
        imprimir();
    }
    private void imprimir(){
        System.out.println(descripcion+" "+color+" su precio es "+ precio);
    }

    public static void main(String arg[]) {
        Estructurando_Clase vestido1 = new Estructurando_Clase();
        Estructurando_Clase vestido2 = new Estructurando_Clase();
        Estructurando_Clase vestido3 = new Estructurando_Clase();
        Estructurando_Clase vestido4 = new Estructurando_Clase();
        vestido1.guardar();
        vestido2.guardar();
        vestido3.guardar();
        vestido4.guardar();
    }
}
