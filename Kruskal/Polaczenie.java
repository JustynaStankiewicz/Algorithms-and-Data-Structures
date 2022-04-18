public class Polaczenie implements Comparable<Polaczenie> {
    private int start;
    private int koniec;
    private int waga;

    public Polaczenie() {
        this.start = 0;
        this.koniec = 0;
        this.waga = 0;
    }

    public int getWaga() {
        return waga;
    }

    public int getKoniec() {
        return koniec;
    }

    public int getStart() {
        return start;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public void setKoniec(int koniec) {
        this.koniec = koniec - 1;
    }

    public void setStart(int start) {
        this.start = start - 1;
    }

    // Comparator uzyty do porownywanie Krawedzi

    @Override
    public int compareTo(Polaczenie o) {
        return this.waga - o.waga;
    }
}
