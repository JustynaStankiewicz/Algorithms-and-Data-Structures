import java.util.Comparator;

public class PunktComparator implements Comparator<Punkt> {

    @Override
    public int compare(Punkt o1, Punkt o2) {
        return (int) (o1.getX() - (o2.getX()));
    }

}
