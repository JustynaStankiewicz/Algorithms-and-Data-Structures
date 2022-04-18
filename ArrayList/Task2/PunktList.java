import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PunktList {
    ArrayList<Punkt> punkty;
    private final PunktComparator Comparator1;

    public PunktList() {
        punkty = new ArrayList<Punkt>();
        Comparator1 = new PunktComparator();
    }


    public void dopiszPunkt(Punkt p) {
        if (!punkty.contains(p)) {
            punkty.add(p);
        } else {
            System.out.println("Ten punkt juz istnieje");
        }
    }

    public String toString() {
        String s = "";
        for (Punkt p : punkty) {
            s = punkty + "\n";
        }
        return s;
    }

    public void sort() {
        List<Punkt> lista = new ArrayList<Punkt>(punkty);
        Collections.sort(lista, Comparator1);
        System.out.println(lista);
    }
}

