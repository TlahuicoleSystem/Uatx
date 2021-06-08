package Uso_datos;

public class Incorporando_Ternario {

    private String[] articulos = new String[4];
    private String nombreCliente, mensaje;
    private double precio, impuesto, total, suma;
    int cantidad, articulost;

    private Incorporando_Ternario(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        cantidad = 1;
        precio = 5.50;
        impuesto = 0.16;
        articulos[0] = "Playera";
        articulos[1] = "Pantalon";
        articulos[2] = "Sueter";
        articulos[3] = "Blusa";
    }

    private void pedido() {
        System.out.println("Hola "+nombreCliente);

        for (String articulo : articulos) {

            articulo = (cantidad > 1) ? articulo.concat("s") : articulo;
            System.out.println(mensaje = cantidad + "......" + articulo + "......." + precio + "......." + cantidad * precio);
            suma = suma + (cantidad * precio);
            precio = precio * 2;
            articulost = articulost + cantidad;
            cantidad++;

        }
        System.out.println("El total de articulos es " + articulost + "\nEl total sin impuestos es " + suma);
        total = suma + (impuesto * suma);
        System.out.println("El costo total con impustos es " + total);
    }
    ///////////////////////////////////////////     main    /////////////////////////////////////////////////////
    public static void main(String arg[]) {
        Incorporando_Ternario c1 = new Incorporando_Ternario("Josue Barrales");
        c1.pedido();
    }
}
