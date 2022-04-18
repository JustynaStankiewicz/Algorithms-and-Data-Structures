import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OdczytZPliku {
    public static String oblicz(String nazwa){
        StringBuilder sb = new StringBuilder();
        try {
            Scanner plik = new Scanner(new File(nazwa));
            while (plik.hasNext()) {
                sb.append(plik.next()+" ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sb.toString();
    }
}
