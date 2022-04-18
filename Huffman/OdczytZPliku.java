import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OdczytZPliku {

    private ArrayList<Character> arrayList;

    public int[] odczyt(String nazwa) {
        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0, J = 0, K = 0, L = 0, M = 0, N = 0, O = 0, P = 0, Q = 0, R = 0, S = 0, T = 0, U = 0, V = 0, W = 0, X = 0, Y = 0, Z = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0, spacja = 0, kropka = 0, przecinek = 0, wykrzyknik = 0, nawiasLewy = 0, nawiadPrawy = 0, zapytanie = 0, srednik = 0, dwukropek = 0;
        arrayList = new ArrayList<Character>();
        String linia;
        char[] litery;
        try (Scanner scanner = new Scanner(new File(nazwa))) {
            while (scanner.hasNextLine()) {
                linia = scanner.nextLine();
                litery = linia.toCharArray();

                for (int jj = 0; jj < litery.length; jj++) {
                    if (litery[jj] == 'A') {
                        A++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'B') {
                        B++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'C') {
                        C++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'D') {
                        D++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'E') {
                        E++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'F') {
                        F++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'G') {
                        G++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'H') {
                        H++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'I') {
                        I++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'J') {
                        J++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'K') {
                        K++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'L') {
                        L++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'M') {
                        M++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'N') {
                        N++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'O') {
                        O++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'P') {
                        P++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'Q') {
                        Q++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'R') {
                        R++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'S') {
                        S++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'T') {
                        T++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'U') {
                        U++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'V') {
                        V++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'W') {
                        W++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'X') {
                        X++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'Y') {
                        Y++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'Z') {
                        Z++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'a') {
                        a++;
                        arrayList.add(litery[jj]);

                    }
                    if (litery[jj] == 'b') {
                        b++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'c') {
                        c++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'd') {
                        d++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'e') {
                        e++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'f') {
                        f++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'g') {
                        g++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'h') {
                        h++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'i') {
                        i++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'j') {
                        j++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'k') {
                        k++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'l') {
                        l++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'm') {
                        m++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'n') {
                        n++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'o') {
                        o++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'p') {
                        p++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'q') {
                        q++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'r') {
                        r++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 's') {
                        s++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 't') {
                        t++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'u') {
                        u++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'v') {
                        v++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'w') {
                        w++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'x') {
                        x++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'y') {
                        y++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == 'z') {
                        z++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == ' ') {
                        spacja++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == '.') {
                        kropka++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == ',') {
                        przecinek++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == '!') {
                        wykrzyknik++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == '(') {
                        nawiasLewy++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == ')') {
                        nawiadPrawy++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == '?') {
                        zapytanie++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == ';') {
                        srednik++;
                        arrayList.add(litery[jj]);
                    }
                    if (litery[jj] == ':') {
                        dwukropek++;
                        arrayList.add(litery[jj]);
                    }

                }
            }
        } catch (FileNotFoundException eee) {
            eee.printStackTrace();
        }
        int[] tablica = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, spacja, kropka, przecinek, wykrzyknik, nawiasLewy, nawiadPrawy, zapytanie, srednik, dwukropek};
        return tablica;
    }

    public ArrayList<Character> getArrayList() {
        return arrayList;
    }
}
