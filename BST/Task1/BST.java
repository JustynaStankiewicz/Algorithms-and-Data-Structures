import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class BST<T> {

    class Node {
        T value; // element
        Node left;
        Node right;

        Node(T obj) {
            value = obj;
            right = null;
            left = null;
        }

        Node(T obj, Node leftNode, Node rightNode) {
            value = obj;
            left = leftNode;
            right = rightNode;
        }
    }

    private final Comparator<T> _comparator;
    public Node _root;

    public BST(Comparator<T> comp) {
        _comparator = comp;
        _root = null;
    }

    public T find(T elem) {
        Node node = search(elem);
        return node == null ? null : node.value;
    }

    private Node search(T elem) {
        Node node = _root;
        int cmp = 0;
        while (node != null && (cmp = _comparator.compare(elem, node.value)) != 0)
            node = cmp < 0 ? node.left : node.right;
        return node;
    }

    //inOrder
    public void inOrderWalk(Node node, ArrayList<Comparable> list) {
        if (node != null) {
            inOrderWalk(node.left, list);
            list.add((Comparable) node.value);
            inOrderWalk(node.right, list);
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    //uppper
    public Comparable upper(Node node, T elem) {
        ArrayList<Comparable> list = new ArrayList<>();
        inOrderWalk(node, list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(elem) >= 0) {
                return list.get(i);
            }
        }
        throw new NoSuchElementException();
    }


    //lower
    public Comparable lower(Node node, T elem) {
        ArrayList<Comparable> list = new ArrayList<>();
        inOrderWalk(node, list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).compareTo(elem) <= 0) {
                return list.get(i);
            }
        }
        throw new NoSuchElementException();
    }


    //insert
    public void insert(T elem) {
        _root = insert(_root, elem);
    }

    private Node insert(Node node, T elem) {
        if (node == null)
            node = new Node(elem);
        else {
            int cmp = _comparator.compare(elem, node.value);
            if (cmp < 0)
                node.left = insert(node.left, elem);
            else if (cmp > 0)
                node.right = insert(node.right, elem);
            else
                return null;
        }
        return node;
    }


    //delete
    public void delete(T elem) {
        _root = delete(elem, _root);
    }

    protected Node delete(T elem, Node node) {
        if (node == null) throw new NoSuchElementException();
        else {
            int cmp = _comparator.compare(elem, node.value);
            if (cmp < 0)
                node.left = delete(elem, node.left);
            else if (cmp > 0)
                node.right = delete(elem, node.right);
            else if (node.left != null && node.right != null)
                node.right = detachMin(node, node.right);//osobna metoda usuwa minimum z prawego poddrzewa
            else node = (node.left != null) ? node.left : node.right;
        }
        return node;
    }

    private Node detachMin(Node del, Node node) {
        if (node.left != null)
            node.left = detachMin(del, node.left);
        else {
            del.value = node.value;
            node = node.right;
        }
        return node;
    }

//__________________________________________________________________

    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int x = 3;
        int y = 9;
        tree.insert(7);
        tree.insert(5);
        tree.insert(2);
        tree.insert(10);
        tree.insert(12);
        tree.insert(1);
        tree.traverseInOrder(tree._root);
        System.out.print("\nUpper for " + x + ": ");
        System.out.println(tree.upper(tree._root, x));
        System.out.print("Lower for " + x + ": ");
        System.out.println(tree.lower(tree._root, x));
        tree.delete(5);
        tree.traverseInOrder(tree._root);
        System.out.print("\nUpper for " + y + ": ");
        System.out.println(tree.upper(tree._root, y));
        System.out.print("Lower for " + y + ": ");
        System.out.println(tree.lower(tree._root, y));


    }
}
