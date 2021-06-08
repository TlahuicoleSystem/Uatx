package Figuras;

public abstract class Figuras_Geometricas {

    private double area;
    private double perimetro;

    public Figuras_Geometricas() {
        area = 0;
        perimetro = 0;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrarArea() {
        calcularArea();
        double a = getArea();
        System.out.println("Es: " + getArea());
    }

    public void mostrarPerimetro() {
        calcularPerimetro();
        System.out.println("Es: " + getPerimetro());
    }
}
