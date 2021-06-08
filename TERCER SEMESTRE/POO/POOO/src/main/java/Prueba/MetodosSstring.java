package Prueba;

public class MetodosSstring {

    private String cadena1;
    private String cadena2;

    private MetodosSstring() { 
        cadena1 = "ESTA ES LA CADENA 1";
        cadena2 = " Y esta es la cadena 2";
    }

    private void Concatenar() { 
        System.out.println(cadena1.concat(cadena2)+"\n");
    }

    private void Lenght() {
        System.out.println("Y mide: " + cadena1.length()+"\n");
    }

    private void Trim() {
        String cadena3 = "      Esta cadena tiene espacios el principio y al final      ";
        System.out.println("<" + cadena3 + ">\nPero con la funcion trim queda asi; " + cadena3.trim()+"\n");
    }

    private void minusculas() {
        System.out.println("El resultado es: " + cadena1.toLowerCase()+"\n");
    }

    private void mayusculas() {
        System.out.println("El resultado  es: " + cadena2.toUpperCase()+"\n");
    }

    private void IndexOf(String po) {
        System.out.println("La posicion es: " + cadena1.indexOf(po)+"\n");
    }

    private void SubString(int po1, int po2) {
        System.out.println("El resultado es: " + cadena1.substring(po1, po2)+"\n");
    }

    private void ParseInt(String cadena6) {
        System.out.println(Integer.parseInt(cadena6)+"\n");
    }

    public static void main(String arg[]) {
        MetodosSstring p1 = new MetodosSstring();
        System.out.println("Cadena1 = " +p1.cadena1 + "\nCadena2 = " +p1.cadena2 +"\n");
        System.out.println("El resultado de concatenar las dos cadenas es: ");
        p1.Concatenar();
        System.out.println("Vamos a medir la cadena 1 con el metodo Lenght:");
        p1.Lenght();
        
        p1.Trim();
        System.out.println("La cadena 1 esta en mayusculas y con el metodo toLowerCase...");
        p1.minusculas();
        System.out.println("La cadena 2 esta en minusculas y con el metodo toUpperCase...");
        p1.mayusculas();
        System.out.println("Vamos a sacar el indice de una letra (A) de la cadena 1: ");
        p1.IndexOf("A");
        System.out.println("Vamos a sacar una subcadena de cadena1 con el metodo SubString (Ingresamos los indices)");
        p1.SubString(0, 6);
        System.out.println("Ingresamos un valor a la cadena y el resultado en entero es:");
        p1.ParseInt("70");
    }
}
