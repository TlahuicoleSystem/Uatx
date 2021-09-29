import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Map;
import java.util.HashMap;

public class Sepomex {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new FileInputStream("sepomex.txt"));

        long stamp = System.currentTimeMillis();
        String line;

        Map<String, String> estados = new HashMap<>();
        Map<String, String> municipios = new HashMap<>();
        Map<String, String> colonias = new HashMap<>();
        while (true) {
            try {
                line = input.nextLine();
                String[] data = line.split("\\|");

                // estado
                String nombreEstado = data[4];
                String idEstado = data[7];
                estados.put(idEstado, nombreEstado);

                // municipio
                String nombreMunicipio = data[3];
                String idMunicipio = data[11];
                municipios.put(idMunicipio, nombreMunicipio);

                // colonia
                String nombreColonia = data[1];
                String idColonia = data[12];
                colonias.put(nombreColonia.toLowerCase(), nombreColonia);
            } catch (Exception e) {
                line = null;
                break;
            }
        }
        System.out.println("Estados registrados: " + estados.size());
        System.out.println("Es estado 29 es " + estados.get("29"));
        System.out.println("Municipios registrados: " + municipios.size());
        System.out.println("Colonias registradas: " + colonias.size());
        System.out.println("Informacion para colonia con nombre huamantla centro: " + colonias.get("huamantla centro"));
        System.out.println("Informacion para colonia con nombre tlaxcala centro: " + colonias.get("tlaxcala centro"));
        System.out.println("Time: " + ((double)(System.currentTimeMillis() - stamp) / 1000l));
    }
}