package Task2;

import java.util.ArrayList;

public class Student2 {
    private long numerIndeksu;
    private String nazwisko;
    private String imie;
    // private double ocena;
    ArrayList<Double> oceny = new ArrayList<Double>();

    public Student2(long numerIndeksu, String nazwisko, String imie,/*double ocena*/ArrayList oceny) {
        this.numerIndeksu = numerIndeksu;
        this.nazwisko = nazwisko;
        this.imie = imie;
        //this.ocena=ocena;
        this.oceny = oceny;
    }

    public ArrayList getOceny() {
        return oceny;
    }

    public long getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    /*public double getOcena() {
        return ocena;
    }*/

    public void setOceny(ArrayList oceny) {
        this.oceny = oceny;
    }

    public void setNumerIndeksu(long numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    /*public void setOcena(double ocena) {
        this.ocena = ocena;
    }*/
    public String toString() {
        return "numer indeksu: " + numerIndeksu + ", nazwisko: " + nazwisko + ", imie: " + imie + ", oceny:" + oceny;
    }

    public Double obliczSrednia() {
        double suma = 0;
        if (!oceny.isEmpty()) {
            for (Double ocenka : oceny) {
                suma += ocenka;
            }

            //System.out.println(suma/ilosc);
            //System.out.println(oceny.size());
            return suma / oceny.size();
        }
        return suma;
    }
}
