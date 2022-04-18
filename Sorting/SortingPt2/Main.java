package Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //tablice dla danych losowych
        Integer[] tablica1 = new Integer[10000];
        Integer[] tablica2;
        Integer[] tablica3;
        Integer[] tablica4;
        Integer[] tablica5;
        Integer[] tablica6;

        //tablice dla danych rosnacych
        Integer[] tablicaRosnaca1;
        Integer[] tablicaRosnaca2;
        Integer[] tablicaRosnaca3;
        Integer[] tablicaRosnaca4;
        Integer[] tablicaRosnaca5;
        Integer[] tablicaRosnaca6;

        //tablice dla danych malejacych
        Integer[] tablicaMalejaca1;
        Integer[] tablicaMalejaca2;
        Integer[] tablicaMalejaca3;
        Integer[] tablicaMalejaca4;
        Integer[] tablicaMalejaca5;
        Integer[] tablicaMalejaca6;

        Random generator = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = generator.nextInt();
        }
        //kopiujemy tablice do pozostalych tablic
        tablica2 = tablica3 = tablica4 = tablica5 = tablica6 = tablicaMalejaca1 = tablicaRosnaca1 = tablica1;

        //kopiujemy tablice do pozostalych tablic rosnacych
        Arrays.sort(tablicaRosnaca1);
        tablicaRosnaca2 = tablicaRosnaca3 = tablicaRosnaca4 = tablicaRosnaca5 = tablicaRosnaca6 = tablicaRosnaca1;

        //kopiujemy tablice do pozostalych tablic malejacych
        Arrays.sort(tablicaMalejaca1, Collections.reverseOrder());
        tablicaMalejaca2 = tablicaMalejaca3 = tablicaMalejaca4 = tablicaMalejaca5 = tablicaMalejaca6 = tablicaMalejaca1;

        long start;
        long finish;

        System.out.println("Testy wykonano dla " + tablica1.length + " liczb losowych z zakresu 0 do 100");

        //Algorytmy dla danych losowych

        System.out.println("\n\n\nAlgorytmy dla danych losowych\n");

        //Zad1.BubbleSort
        start = System.nanoTime();
        BubbleSort1 algorytm1 = new BubbleSort1();
        algorytm1.sort(tablica1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //Zad1.InsertSort
        start = System.nanoTime();
        InsertSort algorytm2 = new InsertSort();
        algorytm2.sort(tablica2);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.InsertSort: " + finish / 1000000000f + " s");

        //Zad1.SelectSort
        start = System.nanoTime();
        SelectSort1 algorytm3 = new SelectSort1();
        algorytm3.sort(tablica3);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.SelectSort: " + finish / 1000000000f + " s");


        //Algorytmy dla danych rosnacych

        System.out.println("\n\n\nAlgorytmy dla danych rosnacych\n");

        //Zad1.BubbleSort
        start = System.nanoTime();
        BubbleSort1 algorytmDlaRosnacych1 = new BubbleSort1();
        algorytmDlaRosnacych1.sort(tablicaRosnaca1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //Zad1.InsertSort
        start = System.nanoTime();
        InsertSort algorytmDlaRosnacych2 = new InsertSort();
        algorytmDlaRosnacych2.sort(tablicaRosnaca2);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.InsertSort: " + finish / 1000000000f + " s");

        //Zad1.SelectSort
        start = System.nanoTime();
        SelectSort1 algorytmDlaRosnacych3 = new SelectSort1();
        algorytmDlaRosnacych3.sort(tablicaRosnaca3);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.SelectSort: " + finish / 1000000000f + " s");


        //Algorytmy dla danych malejacych

        System.out.println("\n\n\nAlgorytmy dla danych malejacych\n");

        //Zad1.BubbleSort
        start = System.nanoTime();
        BubbleSort1 algorytmydlaMalejacych1 = new BubbleSort1();
        algorytmydlaMalejacych1.sort(tablicaMalejaca1);
        finish = System.nanoTime() - start;
        System.out.println("BubleSort: " + finish / 1000000000f + " s");

        //Zad1.InsertSort
        start = System.nanoTime();
        InsertSort algorytmydlaMalejacych2 = new InsertSort();
        algorytmydlaMalejacych2.sort(tablicaMalejaca2);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.InsertSort: " + finish / 1000000000f + " s");

        //Zad1.SelectSort
        start = System.nanoTime();
        SelectSort1 algorytmydlaMalejacych3 = new SelectSort1();
        algorytmydlaMalejacych3.sort(tablicaMalejaca3);
        finish = System.nanoTime() - start;
        System.out.println("Zad1.SelectSort: " + finish / 1000000000f + " s");


    }
}
