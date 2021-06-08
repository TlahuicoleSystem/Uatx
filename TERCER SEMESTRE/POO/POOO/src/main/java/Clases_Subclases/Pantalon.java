package Clases_Subclases;


public class Pantalon extends Ropa {


    private String genero;
    private String ocacion;

    public Pantalon(String genero, String ocacion, String color, String talla, double precio) {
        super(color, talla, precio);
        this.genero = genero;
        this.ocacion = ocacion;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setOcacion(String ocacion) {
        this.ocacion = ocacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getOcacion() {
        return ocacion;
    }

    @Override
    public String imprimir() {
        String mensaje = " El pantalon es ".concat(getcolor()).concat(" | La talla es ").concat(gettalla()).concat(" | Su precio es ").concat(String.valueOf(getprecio())).concat(" | El genero es ").concat(getGenero()).concat(" | y es  ").concat(getOcacion());
        return mensaje;
    }

}
