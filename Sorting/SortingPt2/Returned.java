package Task1;


public class Returned {
    int liczbaPrzesuniec;
    int liczbaPorownan;
    long czas;

    public Returned(int liczbaPorownan, int liczbaPrzesuniec, long czas) {
        this.liczbaPorownan = liczbaPorownan;
        this.liczbaPrzesuniec = liczbaPrzesuniec;
        this.czas = czas;
    }

    public int getLiczbaPorownan() {
        return liczbaPorownan;
    }

    public int getLiczbaPrzesuniec() {
        return liczbaPrzesuniec;
    }

    @Override
    public String toString() {
        return "Returned{" +
                "liczbaPrzesuniec=" + liczbaPrzesuniec +
                ", liczbaPorownan=" + liczbaPorownan +
                ", czas=" + czas +
                '}';
    }
}
