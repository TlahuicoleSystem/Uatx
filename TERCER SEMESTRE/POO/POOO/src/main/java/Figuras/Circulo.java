package Figuras;

/**
 *
 * @author josue
 */
public class Circulo extends Figuras_Geometricas {

    private double radio;
    final double pi = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        setArea(pi * (Math.pow(getRadio(), 2)));
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(pi * (2 * getRadio()));
        return getPerimetro();
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("Perimetro del ---> Circulo\nCon radio: " + getRadio());
        super.mostrarPerimetro();

    }

    @Override
    public void mostrarArea() {
        System.out.println("Area del ---> Circulo\nCon radio: " + getRadio());
        super.mostrarArea();

    }

}
