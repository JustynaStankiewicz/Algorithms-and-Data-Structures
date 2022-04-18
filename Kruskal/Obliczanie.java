import java.io.File;
import java.util.Scanner;

public class Obliczanie {
    public static void oblicz(String nazwa) {
        try {
            Scanner plik = new Scanner(new File(nazwa));

            int n = plik.nextInt();
            int m = plik.nextInt();
            if (n < 1 || n > 20 || m < 0 || m > 190) {
                throw new Blad();
            }

            int i = 0;
            Graf graf = new Graf(n, m);
            while (plik.hasNext()) {
                int start = plik.nextInt();
                int koniec = plik.nextInt();
                int waga = plik.nextInt();
                if (start < 1 || koniec > n || waga < 1 || waga > 500) {
                    throw new Blad();
                }
                graf.polaczenia[i].setStart(start);
                graf.polaczenia[i].setKoniec(koniec);
                graf.polaczenia[i].setWaga(waga);
                i++;
            }
            graf.Kruskal();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
