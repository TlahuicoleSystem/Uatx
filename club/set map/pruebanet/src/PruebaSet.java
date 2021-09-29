

import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Set;
import java.util.HashSet;
public class PruebaSet {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi World!");
        Scanner input = new Scanner(new FileInputStream("C:\\Users\\gbj_0\\Documents\\Uatx\\club\\set map\\pruebanet\\src\\palabras.txt"));

        Set<String> palabras = new HashSet<>();

        long stamp = System.currentTimeMillis();
        String line;
        do {
            try {
                line = input.nextLine();
            } catch (Exception e) {
                line = null;
                break;
            }
            palabras.add(line);
        } while(line != null);
        //System.out.println("Sin repetir:");
        //System.out.println(palabras);
        System.out.println("Time: " + ((double)(System.currentTimeMillis() - stamp) / 1000l));
    }
}

    

