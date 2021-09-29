import java.util.Scanner;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

public class QuitaPalabrasRepetidas {

    public static void main(String[] args) throws Exception {
        System.out.println("Hi World!");
        Scanner input = new Scanner(new FileInputStream("palabras.txt"));

        List<String> palabras = new ArrayList<>();

        long stamp = System.currentTimeMillis();
        String line;
        do {
            try {
                line = input.nextLine();
            } catch (Exception e) {
                line = null;
                break;
            }
            boolean exists = false;
            for (String palabra : palabras) {
                if (palabra.equals(line)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                palabras.add(line);
            }
        } while(line != null);
        System.out.println("Sin repetir:");
        System.out.println(palabras);
        System.out.println("Time: " + ((double)(System.currentTimeMillis() - stamp) / 1000l));
    }
}