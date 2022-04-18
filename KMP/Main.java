public class Main {
    public static void main(String[] args) {
        KMP kmp=new KMP();
        long start1 = System.currentTimeMillis();
        kmp.szukaj("Adam Mickiewicz Pan Tadeusz czyli ostatni zajazd na Litwie Księga pierwsza Gospodarstwo Powrót panicza — Spotkanie się pierwsze w pokoiku, drugie u stołu — Ważna Sędziego nauka o grzeczności — Podkomorzego uwagi polityczne nad modami — Początek sporu o Kusego i Sokoła — Żale Wojskiego — Ostatni Woźny Trybunału — Rzut oka na ówczesny stan polityczny Litwy i Europy Litwo!",OdczytZPliku.oblicz("panTadeusz.txt"));
        long koniec1 = System.currentTimeMillis()-start1;


        long start2 = System.currentTimeMillis();
        kmp.szukaj("Tadeusz",OdczytZPliku.oblicz("panTadeusz.txt"));
        long koniec2 = System.currentTimeMillis()-start2;
        //System.out.println(OdczytZPliku.oblicz("panTadeusz.txt"));

        long start3 = System.currentTimeMillis();
        kmp.szukaj("2. dla krótkiego tekstu, np. stronie tekstu.",OdczytZPliku.oblicz("strona.txt"));
        long koniec3 = System.currentTimeMillis()-start3;

        long start4 = System.currentTimeMillis();
        kmp.szukaj("te",OdczytZPliku.oblicz("strona.txt"));
        long koniec4 = System.currentTimeMillis()-start4;
        //System.out.println(OdczytZPliku.oblicz("strona.txt"));

        System.out.println("\nCzas dla ksiazki(krotszy wzorzec): "+koniec2);
        System.out.println("Czas dla ksiazki(dlugi wzorzec): "+koniec1);
        System.out.println("Czas dla strony(dlugi wzorzec):"+koniec3);
        System.out.println("Czas dla strony(krotszy wzorzec):"+koniec4);
    }
}
