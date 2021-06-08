package Prueba;

public class Alumno {

    private String nombre, apellidos, licenciatura, materia;
    private int edad, telefono;
    private double promedio;

    private Alumno() {
        materia = "Programacion Orientada en Objetos";
    }

    private Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    private Alumno(int edad, int telefono) {
        this.edad = edad;
        this.telefono = telefono;
    }

    private Alumno(String licenciatura, double promedio) {
        this.licenciatura = licenciatura;
        this.promedio = promedio;
    }

    private void imprimir() {
        System.out.println("Soy " + nombre + " " + apellidos);
    }

    private void imprimir(String lugar) {
        System.out.println("tengo " + edad + ", Mi telefono es " + telefono + ", soy de " + lugar);
    }

    private void imprimir(int semestre, String universidad) {
        System.out.println("Estoy estudiando " + licenciatura + ", en la " + universidad + ", mi promedio es " + promedio + ", y curso el semestre " + semestre);
    }

    public static void main(String arg[]) {
        Alumno a1 = new Alumno();
        System.out.println("Esto es " + a1.materia);
        Alumno a2 = new Alumno("josue", "Barrales");
        a2.imprimir();
        Alumno a3 = new Alumno(18, 123654);
        a3.imprimir("Cuapiaxtla");
        Alumno a4 = new Alumno("computacion", 8.1);
        a4.imprimir(3, "UAT");

    }

    /* Esto es para el segundo trabajo que entregue
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getLicenciatura() {
        return licenciatura;
    }
     */
}
