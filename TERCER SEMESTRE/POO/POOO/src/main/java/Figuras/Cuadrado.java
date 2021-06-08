package Figuras;
public class Cuadrado extends Figuras_Geometricas {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        setArea(getLado() * getLado());
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(getLado() * 4);
        return getPerimetro();
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro del ---> Cuadrado\nCon lado: " + getLado());
        super.mostrarPerimetro();
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del ---> Cuadrado\nCon lado: " + getLado());
        super.mostrarArea();
    }

}
