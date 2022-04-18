import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ZbiorDrzew zbiorDrzew = new ZbiorDrzew();
        zbiorDrzew.utworzDrzewa("Inwokacja.txt");
        zbiorDrzew.kodowanie("Inwokacje2.txt");
        System.out.println(zbiorDrzew.odkodowanie(zbiorDrzew.getTekst2()));
    }
}
