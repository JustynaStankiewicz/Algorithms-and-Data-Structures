import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    private BST<Integer> tree;


    @BeforeEach
    public void setUp() {
        tree = new BST<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    @Test
    public void testInsert() {
        tree.insert(7);
        tree.insert(5);
        tree.insert(2);
        tree.insert(10);
        tree.insert(12);
        tree.insert(1);
        assertEquals(2, tree.lower(tree._root, 3));
        assertEquals(5, tree.upper(tree._root, 3));
    }

    @Test
    public void testDelete() {
        tree.insert(7);
        tree.insert(2);
        tree.insert(5);
        tree.insert(10);
        tree.insert(12);
        tree.insert(1);
        tree.delete(5);
        assertEquals(2, tree.lower(tree._root, 3));
        assertEquals(7, tree.upper(tree._root, 3));

    }
}


