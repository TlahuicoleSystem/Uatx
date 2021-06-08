package Clases_Subclases;

/**
 *
 * @author josue
 */
import java.util.ArrayList;

public class ControlRopa {

    ArrayList<Ropa> prenda;

    public ControlRopa() {
        prenda = new ArrayList();
    }

    public void agregarVestido(double longitud, double medidaC, String color, String talla, double precio) {
        prenda.add(new Vestido(longitud, medidaC, color, talla, precio));
    }

    public void agregarPantalon(String genero, String ocacion, String color, String talla, double precio) {
        prenda.add(new Pantalon(genero, ocacion, color, talla, precio));
    }

    public void agregarCamisa(String tManga, int nBolsillos, String color, String talla, double precio) {
        prenda.add(new Camisa(tManga, nBolsillos, color, talla, precio));
    }

    public String imprimirA() {
        String mensajeSalida = "";
        int indice = 1;
        for (Ropa r : prenda) {
            //Se esta llamando el metodo el cual va a ir cambiando dependiendo de el objeto(Polimorfismo)
            mensajeSalida = mensajeSalida + "EL INDICE ES ".concat(Integer.toString(indice))+"  ".concat(r.imprimir()).concat("\n");
            indice++;
        }
        return mensajeSalida; 
    }
    public void eliminarA(int indice){
        indice--;
        prenda.remove(indice);
    }

}
