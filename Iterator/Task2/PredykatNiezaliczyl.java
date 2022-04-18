package Task2;

public class PredykatNiezaliczyl implements Predicate {
    @Override
    public boolean accept(Object o) {
        Student2 s = (Student2) o;
        return s.obliczSrednia() < 3;
    }
}
