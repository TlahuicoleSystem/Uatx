package Figuras;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Principal {

    public static void main(String args[]) {
        ArrayList<Figuras_Geometricas> figuritas = new ArrayList();
        figuritas.add(new Cuadrado(5));
        figuritas.add(new Triangulo(5, 5, 4, 4));
        figuritas.add(new Circulo(5));
        figuritas.add(new Cuadrado(4));

        for (Figuras_Geometricas f : figuritas) {
            f.mostrarArea();
            f.mostrarPerimetro();
            System.out.println("________________________________");
        }

    }
}

