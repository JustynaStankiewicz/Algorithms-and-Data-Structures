package Task1;

public class PredykatNiezaliczyl implements Predicate {
    @Override
    public boolean accept(Object o) {
        Student s = (Student) o;
        return s.getOcena() < 3;
    }
}
