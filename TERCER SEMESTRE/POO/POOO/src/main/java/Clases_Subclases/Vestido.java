package Clases_Subclases;


public class Vestido extends Ropa {


    private double longitud;
    private double medidaC;

    public Vestido(double longitud, double medidaC, String color, String talla, double precio) {
        super(color, talla, precio);
        this.longitud = longitud;
        this.medidaC = medidaC;
    }


    public double getLongitud() {
        return longitud;
    }

    public double getMedidaC() {
        return medidaC;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setMedidaC(double medidaC) {
        this.medidaC = medidaC;
    }

    @Override
    public String imprimir() {
        String mensaje = " El vestido ".concat(getcolor()).concat(" | La talla es ").concat(gettalla()).concat(" | Su precio es ").concat(String.valueOf(getprecio())).concat(" | La altura es ").concat(String.valueOf(getLongitud())).concat(" | La cintura es de ").concat(String.valueOf(getMedidaC()));
        return mensaje;
    }

}
