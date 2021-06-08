package Clases_Subclases;


public abstract class Ropa {

    private String color;
    private String talla;
    private double precio;

    public Ropa(String color, String talla, double precio) {
        this.color = color;
        this.talla = talla;
        this.precio = precio;
    }
    public String getcolor() {
        return color;
    }

    public String gettalla() {
        return talla;
    }

    public double getprecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    abstract String imprimir();

}
