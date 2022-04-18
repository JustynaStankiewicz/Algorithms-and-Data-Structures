package Zadanie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MedianaTest {
    private Mediana testy;
    private ArrayList<Integer> temp = new ArrayList<>();


    @BeforeEach
    void stworz() {
        temp.clear();
        temp.add(2);
        temp.add(36);
        temp.add(5);
        temp.add(21);
        temp.add(8);
        temp.add(13);
        temp.add(11);
        temp.add(20);
        temp.add(5);
        temp.add(4);
        temp.add(1);
    }
    /*@Test(expected=IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
       k=-1;
    }*/


    @Test
    void czyDobreWartosci() {
        for (int i = 0; i < 7; i++) {
            assertEquals(1, testy.selekcja(temp, 1));
            assertEquals(2, testy.selekcja(temp, 2));
            assertEquals(4, testy.selekcja(temp, 3));
            assertEquals(5, testy.selekcja(temp, 4));
            assertEquals(11, testy.selekcja(temp, 7));
            assertEquals(13, testy.selekcja(temp, 8));
            assertEquals(20, testy.selekcja(temp, 9));
            assertEquals(21, testy.selekcja(temp, 10));
            assertEquals(36, testy.selekcja(temp, 11));
        }
    }

}
