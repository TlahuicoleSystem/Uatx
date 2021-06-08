package Uso_datos;

public class Venta {

    private String nombreCliente, decripcionArticulo, mensaje;
    private double precio, impuesto, total;
    int cantidad;
    boolean fueraDeInventario;

    private Venta(String nombreCliente, String decripcionArticulo, int cantidad) {
        this.nombreCliente = nombreCliente;
        this.decripcionArticulo = decripcionArticulo;
        precio = 5.50;
        impuesto = 1.23;
        this.cantidad = cantidad;
    }

    private void pedido(boolean fueraDeInventario) {
        this.fueraDeInventario = fueraDeInventario;
        if (fueraDeInventario == false) {
            System.out.println("LO SENTIMOS EL ARTICULO NO ESTA DISPONIBLE");
        } else {
            if (cantidad > 1) {
                decripcionArticulo = decripcionArticulo.concat("s");
                System.out.println(mensaje = nombreCliente.concat(" Su pedido es " + cantidad + " " + decripcionArticulo));
            } else {
                System.out.println(mensaje = nombreCliente.concat(" Su pedido son " + cantidad + " " + decripcionArticulo));
            }
            total = (precio * cantidad) * impuesto;
            System.out.println("El consto total con impustos es " + total);
        }

    }

    ///////////////////////////////////////////     main    /////////////////////////////////////////////////////
    public static void main(String arg[]) {
        Venta c1 = new Venta("Josue Barrales", "Playera", 10);
        c1.pedido(true);

    }

}
