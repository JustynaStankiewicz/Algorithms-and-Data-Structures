
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BinomialHeapTest {

    private final BinomialHeap<Integer> heap;

    public BinomialHeapTest() {
        this.heap = new BinomialHeap(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    @BeforeEach
    public void clear() {
        heap.clear();
    }


    @Test
    public void testIsEmpty() {
        heap.insert(0);
        assertFalse(heap.isEmpty());
        heap.insert(1);
        assertFalse(heap.isEmpty());
        heap.extractMin();
        assertFalse(heap.isEmpty());
        heap.insert(100);
        heap.insert(10);
        assertFalse(heap.isEmpty());
        heap.clear();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testUnion() {
        heap.insert(1);
        heap.insert(2);

        BinomialHeap heap2 = new BinomialHeap(new Comparator<Integer>() {
            public int compare(Integer o3, Integer o4) {
                return o3 - o4;
            }
        });
        Node union = heap.union(heap2);

    }

}
