class KMP {
    void szukaj(String wzorzec, String tekst) {
        int m = wzorzec.length();//dl wzorca
        int n = tekst.length();//dl tekstu
        int i = 0;//nr indeksu dla wzorca
        int j = 0;//nr indeksu dla tekstu

        int lps[] = new int[m];//'Longest Prefix Sufix' tablica przechowuje dlugosc
                                // najdluzszego prefiksa,
                            //ktory jest wlasciwym sufiksem

        computeLPS(wzorzec, m, lps);

        //petla od i=0 do i=n-1
        while (i < n) {
            if (wzorzec.charAt(j) == tekst.charAt(i)) { //jesli pasuje idziemy do kolejnych indeksow
                j++;                                    //z obu 'tablic'
                i++;
            }
            if (j == m) {
                System.out.println("Znaleziono wzorzec: " + wzorzec
                        + " - na indeksie " + (i - j));

                j = lps[j - 1];
            } else if (i < n && wzorzec.charAt(j) != tekst.charAt(i)) {
                //nie trzeba sprawdzac prefiksu ktory tez jest sufiksem
                if (j != 0)
                    j = lps[j - 1];//cofamy sie do poprzedniej wartosci indeksu z tekstu i tam ustawiamy indeks, punkt niedopasowania
                else //j=0
                    i ++;//kolejny indeks
            }
        }
    }


    void computeLPS(String wzorzec, int m, int lps[]) {
        int dlugosc = 0;//dlugosc najdluzszego prefiksa,
        //ktory jest wlasciwym sufiksem
        int i = 1;
        lps[0] = 0;//pierwsza wartosc zawsze 0

        //pętla od i=1 do i=m-1
        while (i < m) {

            if (wzorzec.charAt(i) == wzorzec.charAt(dlugosc)) {//jesli pasuje, i teraz do wartosci dlugosc dodajemy 1
                lps[i] = dlugosc+1;//nowa wartosc znaku
                dlugosc++;
                i++;
            } else // (wzorzec.charAt(i) != wzorzec.charAt(dlugosc))
            {
                if (dlugosc != 0) {//np dlugosc=1
                    dlugosc = lps[dlugosc - 1];//jest sufiks ktory jest tez prefiksem zatem nie musimy zaczynac od poczatku
                } else // (dlugosc == 0)
                {
                    lps[i] = dlugosc;//=0 zaczynamy od poczatku
                    i++;
                }
            }
        }
    }

}