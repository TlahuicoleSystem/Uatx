package Figuras;

/**
 *
 * @author josue
 */
public class Triangulo extends Figuras_Geometricas {

    private double altura;
    private double lado1;
    private double lado2;
    private double base;

    public Triangulo(double altura, double lado1, double lado2, double base) {
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        setArea((getBase() * getAltura()) / 2);
        return getArea();
    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(getBase() + getLado1() + getLado2());
        return getPerimetro();
    }

    @Override
    public void mostrarPerimetro() {
        System.out.println("El perimetro del ----> Triangulo \nCon lados: " + getBase() + ", " + getLado1() + ", " + getLado2());
        super.mostrarPerimetro();
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del ----> Triangulo \nCon base: " + getBase() + " y Altura: " + getAltura());
        super.mostrarArea();
    }


}
