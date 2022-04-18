package Task1;

import java.util.ArrayList;

public class ProgramPomocniczy1 {
    public void porownajAlgorytmy(ArrayList<Algorytm> algorytmy, Integer[] tablicaUporzadkowana, Integer[] tablicaNieuporzadkowana, Integer[] tablicaCzesciowoUporzadkowana) {
        for (int i = 0; i < algorytmy.size(); i++) {
            Integer[] tablicaNieuporzadkowana2 = new Integer[tablicaNieuporzadkowana.length];
            Integer[] tablicaUporzadkowana2 = new Integer[tablicaUporzadkowana.length];
            Integer[] tablicaCzesciowoUporzadkowana2 = new Integer[tablicaCzesciowoUporzadkowana.length];

            //System.out.println("Przed dzialaniem nieuporzadkowana");
            for (int j = 0; j < tablicaNieuporzadkowana2.length; j++) {
                tablicaNieuporzadkowana2[j] = tablicaNieuporzadkowana[j];
                // System.out.println(tablicaNieuporzadkowana2[j]);
            }
            //System.out.println("Przed dzialaniem uporzadkowana");
            for (int j = 0; j < tablicaUporzadkowana2.length; j++) {
                tablicaUporzadkowana2[j] = tablicaUporzadkowana[j];
                // System.out.println(tablicaUporzadkowana2[j]);
            }
            //System.out.println("Przed dzialaniem czesciowo uporzadkowana");
            for (int j = 0; j < tablicaCzesciowoUporzadkowana2.length; j++) {
                tablicaCzesciowoUporzadkowana2[j] = tablicaCzesciowoUporzadkowana[j];
                // System.out.println(tablicaCzesciowoUporzadkowana2[j]);
            }

            Returned returnedNieuporzad = algorytmy.get(i).sort(tablicaNieuporzadkowana2);
            System.out.println("Nieuporzadkowna Algorytm " + algorytmy.get(i).toString() + " " + returnedNieuporzad.toString());

            Returned returnedUporzad = algorytmy.get(i).sort(tablicaUporzadkowana2);
            System.out.println("Uporzadkowana Algorytm " + algorytmy.get(i).toString() + " " + returnedUporzad.toString());

            Returned returnedCzesciowoUporzad = algorytmy.get(i).sort(tablicaCzesciowoUporzadkowana2);
            System.out.println("Czesciowo uporzadkowana Algorytm " + algorytmy.get(i).toString() + " " + returnedCzesciowoUporzad.toString());

            //System.out.println("Po nieuporzadkowanej");
            for (int j = 0; j < tablicaNieuporzadkowana2.length; j++) {
                //System.out.println(tablicaNieuporzadkowana2[j]);
            }

            //System.out.println("Po uporzadkowanej");
            for (int j = 0; j < tablicaNieuporzadkowana2.length; j++) {
                //System.out.println(tablicaUporzadkowana2[j]);
            }

            //System.out.println("Po czesciowo uporzadkowanej");
            for (int j = 0; j < tablicaCzesciowoUporzadkowana2.length; j++) {
                //System.out.println(tablicaCzesciowoUporzadkowana2[j]);
            }
            System.out.println("\n\n");
        }
    }
}
