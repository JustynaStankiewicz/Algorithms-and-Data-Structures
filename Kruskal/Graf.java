import java.util.Arrays;

public class Graf {
    int n; //liczba lamp
    int m; //liczba polaczen
    Polaczenie polaczenia[]; // tablica krawedzi grafu

    // Tworzenie grafu z m polaczeniami miedzy n lampami
    public Graf(int n, int m) {
        this.n = n;
        this.m = m;
        polaczenia = new Polaczenie[this.m];
        for (int i = 0; i < m; ++i)
            polaczenia[i] = new Polaczenie();
    }

    public void Kruskal() {
        Polaczenie wynik[] = new Polaczenie[n]; // Przechowywanie wyniku Kruskala
        int e = 0; // Indeks zmiennej, uzwany do wynik[]

        // Zmienna indeksująca, używana do sortowanych krawędzi
        int i = 0;
        for (i = 0; i < n; ++i)
            wynik[i] = new Polaczenie();

        //Sortuje wszystkie krawędzie w sposób rosnacy
        //wg ich wagi
        Arrays.sort(polaczenia);

        // Przydzielenie pamięć do tworzenia podzbiorów
        Podzbior podzbior[] = new Podzbior[n];
        for (i = 0; i < n; ++i)
            podzbior[i] = new Podzbior();

        // Twórzenie podzbioru n z pojedynczymi elementami
        for (int x = 0; x < n; ++x) {
            podzbior[x].rodzic = x;
            podzbior[x].stopien = 0;
        }

        i = 0; // Indeks używany do wybierania następnej krawędzi

        // Liczba krawędzi do pobrania jest równa n-1
        while (e < n - 1) {
            // Wybieranie najmniejszej krawedzi
            // oraz inkrementacja indeksu nastepenej iteracji
            Polaczenie nastepnePolaczenie = polaczenia[i++];

            int x = znajdz(podzbior, nastepnePolaczenie.getStart());
            int y = znajdz(podzbior, nastepnePolaczenie.getKoniec());

            //Jeśli uwzględnienie tej krawędzi nie powoduje cyklu
            //uwzględniam go w wyniku i zwiększam indeks
            //wyniku dla następnego polaczenia
            if (x != y) {
                wynik[e++] = nastepnePolaczenie;
                Union(podzbior, x, y);
            }
            // W przeciwnym razie odrzuc nastepnePolaczenie
        }

        int minimalnaDlugosc = 0;
        for (i = 0; i < e; ++i) {
            minimalnaDlugosc += wynik[i].getWaga();
        }
        System.out.println("Minimalna potrzebna dlugosc kabla: " + minimalnaDlugosc + "cm");
    }


    public int znajdz(Podzbior podzbior[], int i) {

        if (podzbior[i].rodzic != i) {
            podzbior[i].rodzic = znajdz(podzbior, podzbior[i].rodzic);
        }

        return podzbior[i].rodzic;
    }

    public void Union(Podzbior podzbior[], int x, int y) {
        int xroot = znajdz(podzbior, x);
        int yroot = znajdz(podzbior, y);

        if (podzbior[xroot].stopien < podzbior[yroot].stopien)
            podzbior[xroot].rodzic = yroot;
        else if (podzbior[xroot].stopien > podzbior[yroot].stopien)
            podzbior[yroot].rodzic = xroot;

        else {
            podzbior[yroot].rodzic = xroot;
            podzbior[xroot].stopien++;
        }
    }


}
