package Task1;

import java.util.ArrayList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Integer tablicaNieuporzadkowana[] = new Integer[10000];
        // = {94, 1, 12, 77, 5, 11};
        Integer tablicaCzesciowoUporzadkowana[] = {1, 2, 6, 4, 5, 7};
        Integer tablicaUporzadkowana[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < tablicaNieuporzadkowana.length; i++) {
            Random random = new Random();
            tablicaNieuporzadkowana[i] = random.nextInt(50);

        }
        ProgramPomocniczy1 pp = new ProgramPomocniczy1();
        ArrayList<Algorytm> algorytms = new ArrayList<>();
        algorytms.add(new BubbleSort1());
        algorytms.add(new InsertSort());
        algorytms.add(new SelectSort1());

        pp.porownajAlgorytmy(algorytms, tablicaUporzadkowana, tablicaNieuporzadkowana, tablicaCzesciowoUporzadkowana);
    }
}
