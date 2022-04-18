import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class ZbiorDrzew {
    PriorityQueue<HuffmanNode> kolejka;
    private HuffmanNode root;
    String tekst = "";
    String tekst2 = "";
    OdczytZPliku odczytZPliku = new OdczytZPliku();
    ArrayList<Character> arrayList = new ArrayList<>();

    public ZbiorDrzew() {
        kolejka = new PriorityQueue<HuffmanNode>(new MyComparator());
    }

    public void utworzDrzewa(String nazwa) {

        int[] litery = odczytZPliku.odczyt(nazwa);
        for (int i = 0; i < litery.length; i++) {
            if (litery[i] > 0) {
                if (i < 26) {
                    char znak = (char) ('a' + i);
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 26) {
                    char znak = (char) ('A');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 27) {
                    char znak = (char) ('B');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 28) {
                    char znak = (char) ('C');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 29) {
                    char znak = (char) ('D');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 30) {
                    char znak = (char) ('E');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 31) {
                    char znak = (char) ('F');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 32) {
                    char znak = (char) ('G');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 33) {
                    char znak = (char) ('H');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 34) {
                    char znak = (char) ('I');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 35) {
                    char znak = (char) ('J');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 36) {
                    char znak = (char) ('K');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 37) {
                    char znak = (char) ('L');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 38) {
                    char znak = (char) ('M');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 39) {
                    char znak = (char) ('N');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 40) {
                    char znak = (char) ('O');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 41) {
                    char znak = (char) ('P');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 42) {
                    char znak = (char) ('Q');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 43) {
                    char znak = (char) ('R');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 44) {
                    char znak = (char) ('S');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 45) {
                    char znak = (char) ('T');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 46) {
                    char znak = (char) ('U');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }

                if (i == 47) {
                    char znak = (char) ('V');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 48) {
                    char znak = (char) ('W');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 49) {
                    char znak = (char) ('X');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 50) {
                    char znak = (char) ('Y');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                }
                if (i == 51) {
                    char znak = (char) ('Z');
                    HuffmanNode hn = new HuffmanNode();
                    hn.waga = litery[i];
                    hn.setZnak(znak);

                    hn.left = null;
                    hn.right = null;

                    kolejka.add(hn);
                } else {
                    if (i == 52) {
                        char znak = ' ';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 53) {
                        char znak = '.';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 54) {
                        char znak = ',';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 54) {
                        char znak = '!';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 54) {
                        char znak = '(';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 54) {
                        char znak = ')';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 54) {
                        char znak = '?';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 55) {
                        char znak = ';';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                    if (i == 56) {
                        char znak = ':';
                        HuffmanNode hn = new HuffmanNode();
                        hn.waga = litery[i];
                        hn.setZnak(znak);

                        hn.left = null;
                        hn.right = null;

                        kolejka.add(hn);
                    }
                }
            }
        }
        realizujHuffmana();
        zamiana(getRoot(), "");
    }

    public void realizujHuffmana() {
        while (kolejka.size() > 1) {
            //najmniejszy element
            HuffmanNode pierwszy = kolejka.peek();
            kolejka.poll();
            //drugi najmniejszy element
            HuffmanNode drugi = kolejka.peek();
            kolejka.poll();

            HuffmanNode laczenie = new HuffmanNode();
            laczenie.waga = pierwszy.waga + drugi.waga;
            laczenie.setZnak('-');

            laczenie.left = pierwszy;
            laczenie.right = drugi;
            root = laczenie;
            kolejka.add(laczenie);
        }
        drukuj(getRoot(), "");
    }

    public void drukuj(HuffmanNode node, String s) {
        if (node.left == null && node.right == null && Character.isDefined(node.getZnak())) {
            System.out.println(node.getZnak() + " " + node.waga + " " + s);
            tekst = tekst + s;
            return;
        }


        drukuj(node.left, s + "0");
        drukuj(node.right, s + "1");

    }

    public void zamiana(HuffmanNode node, String s) {
        if (node.left == null && node.right == null && Character.isDefined(node.getZnak())) {
            LiteraKod literaKod = new LiteraKod(node.getZnak(), s);
            return;
        }

        zamiana(node.left, s + "0");
        zamiana(node.right, s + "1");
    }

    public String odkodowanie(String string) {
        HuffmanNode current = root;
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < string.length(); i++) {
            if (current.left == null && current.right == null && Character.isDefined(current.getZnak())) {
                sb.append(current.getZnak());
                current = root;
            }

            if (string.charAt(i) == '0') {
                current = current.left;
            }
            if (string.charAt(i) == '1') {
                current = current.right;
            }
        }
        if (current.left == null && current.right == null) {
            sb.append(current.getZnak());
        }
        return sb.toString();

    }


    public static int znajdzWysokosc(HuffmanNode node) {
        if (node == null) {
            return -1;
        }

        int wysokosclewa = znajdzWysokosc(node.left);
        int wysokoscprawa = znajdzWysokosc(node.right);

        if (wysokosclewa > wysokoscprawa) {
            return wysokosclewa + 1;
        } else {
            return wysokoscprawa + 1;
        }
    }

    public void litery() {
        for (int i = 0; i < getTekst2().length(); i++) {
            arrayList.add(getTekst2().charAt(i));
        }
    }


    public void kodowanie(String nazwa) {

        for (int i = 0; i < odczytZPliku.getArrayList().size(); i++) {
            tekst2 = tekst2 + LiteraKod.szukanie(odczytZPliku.getArrayList().get(i));
        }
        System.out.print(tekst2);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(nazwa)))) {
            bw.write(tekst2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        litery();
    }

    public HuffmanNode getRoot() {
        return root;
    }

    public String getTekst2() {
        return tekst2;
    }
}
