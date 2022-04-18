package Task1;

import java.io.Serializable;

public class Student implements Serializable {
    private long numerIndeksu;
    private String nazwisko;
    private String imie;
    private double ocena;
    //ArrayList<Double>oceny=new ArrayList<Double>();

    public Student(long numerIndeksu, String nazwisko, String imie, double ocena/*ArrayList<Double>oceny*/) {
        this.numerIndeksu = numerIndeksu;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.ocena = ocena;
        //this.oceny=oceny;
    }

   /* public ArrayList<Double> getOceny() {
        return oceny;
    }*/

    public long getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public double getOcena() {
        return ocena;
    }

    /*public void setOceny(ArrayList<Double> oceny) {
        this.oceny = oceny;
    }*/

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String toString() {
        return "numer indeksu: " + numerIndeksu + ", nazwisko: " + nazwisko + ", imie: " + imie + ", ocena z kursu: " + ocena;/* oceny:"+oceny*/
    }
}

