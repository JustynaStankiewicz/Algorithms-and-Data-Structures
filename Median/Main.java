package Zadanie1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mediana mediana = new Mediana();
        ArrayList<Integer> tablica = new ArrayList<>();
        tablica.add(2);
        tablica.add(36);
        tablica.add(5);
        tablica.add(21);
        tablica.add(8);
        tablica.add(13);
        tablica.add(11);
        tablica.add(20);
        tablica.add(5);
        tablica.add(4);
        tablica.add(1);
        System.out.println("Szukany element: " + mediana.selekcja(tablica, 4));
    }
}
