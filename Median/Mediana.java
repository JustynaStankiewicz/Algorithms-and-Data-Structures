package Zadanie1;

import java.util.*;

public class Mediana {

    //Metoda
    public static int selekcja(ArrayList<Integer> elementy, int k) throws IllegalArgumentException {
        if (k < 1 || k > elementy.size()) {
            throw new IllegalArgumentException();
        }
        //glowna tablica
        ArrayList<Integer> S = new ArrayList<Integer>(elementy);

        //tablice pomocnicze:
        ArrayList<Integer> SL = new ArrayList<Integer>();//elementy mniejsze niz v
        ArrayList<Integer> Sv = new ArrayList<Integer>();//elementy rowne v
        ArrayList<Integer> SR = new ArrayList<Integer>();//elementy wieksze od v

        while (true) {
            //co sekwencję usuwamy zawartosci tablic pomocniczyh
            SL.clear();
            Sv.clear();
            SR.clear();

            //v generowane losowo, aby nie powiekszac zlozonosci obliczeniowej
            Random generator = new Random();
            int v = S.get(generator.nextInt(S.size()));


            //posortowanie elementow w odniesieniu do v
            for (int i = 0; i < S.size(); i++) {
                if (S.get(i) < v) {
                    SL.add(S.get(i));
                }
                if (S.get(i) == v) {
                    Sv.add(S.get(i));
                }
                if (S.get(i) > v) {
                    SR.add(S.get(i));
                }
            }

            if (k <= SL.size()) {
                S = new ArrayList<>(SL);//za glowna tablice S zapisujemy wartosci z SL
            }
            if (SL.size() < k && k <= SL.size() + Sv.size()) {
                return v;//zwracana wartosc rowna v
            }
            int usunieteSLSv = 0;
            if (k > SL.size() + Sv.size()) {
                S = new ArrayList<>(SR);//za glowna tablice S zapisujemy wartosci z SR, a nastepnie
                usunieteSLSv += SL.size() + Sv.size();
                return selekcja(S, k - usunieteSLSv);//zwracamy referencję metody, ale k jest pomniejszone
                // o to co juz usunelismy
            }
        }

    }
}

