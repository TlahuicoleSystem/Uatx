package Uso_datos;

public class Venta_array {

    private String[] articulos = new String[4];
    String nombreCliente, mensaje;

    private Venta_array(String nombreCliente) {
        articulos[0] = "Playera";
        articulos[1] = "Pantalon";
        articulos[2] = "Sueter";
        articulos[3] = "Blusa";
        this.nombreCliente = nombreCliente;
    }

    private void pedido() {
        System.out.println(mensaje = nombreCliente.concat(" Esta pidiendo " + articulos.length) + " articulos");
        System.out.println("Estoy imprimiendo este articulo... " + articulos[2]);
        System.out.println("Voy a imprimir todos los articulos a comprar...");

        for (String articulo : articulos) {
            System.out.println(articulo);
        }
    }

    public static void main(String arg[]) {
        Venta_array c1 = new Venta_array("Josue Barrales");
        c1.pedido();
    }
}
