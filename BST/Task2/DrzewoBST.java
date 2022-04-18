package Task1;

import java.util.Comparator;

public class DrzewoBST {
    private final Comparator comparator;
    private Node root;

    public DrzewoBST(Comparator comparator) {
        this.comparator = comparator;
        this.root = null;
    }

    //Przejście "in-order"
    public String treeToStringInOrder() {
        String b = "In order: ";
        if (root != null) {
            b += root.toStringInOrder();
        } else b += "drzewo puste";
        return b;
    }
//___________________________________________

    //Przejście "pre-order"
    public String treeToStringPreOrder() {
        String b = "Pre order: ";
        if (root != null) {
            b += root.toStringPreOrder();
        } else b += "drzewo puste";
        return b;
    }

//___________________________________________

    //Przejście "post-order"
    public String treeToStringPostOrder() {
        String b = "Post order: ";
        if (root != null) {
            b += root.toStringPostOrder();
        } else b += "drzewo puste";
        return b;
    }

//___________________________________________


    //wyszukiwanie elementu w drzewie
    public Object find(Comparable x) {
        Node t = search(x);
        return t != null ? t.value : null;
    }

    private Node search(Comparable value) {
        Node node = root;
        int cmp = 0;
        while (node != null && (cmp = comparator.compare(value, node.value)) != 0) {
            node = cmp < 0 ? node.left : node.right;
        }
        return node;
    }
//___________________________________________


    //wstawienie elementu do drzewa (dołączenie nowego wierzchołka)
    public void insert(Comparable x) {
        root = insert(x, root);
    }

    protected Node insert(Comparable x, Node t) {
        if (t == null) {
            t = new Node(x);
        } else {
            int cmp = comparator.compare(x, t.value);
            if (cmp < 0) t.left = insert(x, t.left);
            else if (cmp > 0) t.right = insert(x, t.right);
            else throw new DuplicateItemException(x.toString());
        }
        return t;
    }


    public class DuplicateItemException extends RuntimeException {
        public DuplicateItemException(String message) {
            super(message);
        }
    }
//___________________________________________


    //usunięcie wierzchołka o podaej wartości klucza
    public void delete(Comparable x) {
        root = delete(x, root);
    }

    protected Node delete(Comparable x, Node t) {
        if (t == null) {
            System.out.println("Nie znaleziono objektu " + x.toString());
        } else {
            int cmp = comparator.compare(x, t.value);
            if (cmp < 0) t.left = delete(x, t.left);
            else if (cmp > 0) t.right = delete(x, t.right);
            else if (t.left != null && t.right != null) t.right = detachMin(t.right, t);
            else t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }

    //usuniecie nastepnika
    // -{Nastepnik to skrajny lewy element prawego podrzewa danego elementu}
    protected Node detachMin(Node t, Node del) {
        if (t.left != null) t.left = detachMin(t.left, del);
        else {
            del.value = t.value;
            t = t.right;
        }
        return t;
    }

//___________________________________________

    //Minimum
    public Node minvalue(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    //___________________________________________

    //Maksimum
    public Node maxvalue(Node node) {
        Node current = node;

        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
    //___________________________________________


    public Node predecessor(Node root, Node node) {
        // Example 3 or Example 4
        if (node.left != null)
            return maxvalue(node.left);

        // Example 1 or Example 2
        Node predecessor = null;
        // Start from root and search for predecessor down the tree

        while (root != null) {

            if (node.value == root.value) {
                // by now we might found our predecessor
                break;
            } else if (node.value.compareTo(root.value) < 0) {
                root = root.left;
            } else if (node.value.compareTo(root.value) > 0) {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }

    public Node successor(Node root, Node node) {
        //Example 3 or Example 4
        if (node.right != null) {
            return minvalue(node.right);
        }


        //Example 1 or Example 2
        Node successor = null;
        // Start from root and search for successor down the tree
        while (root != null) {
            if (node.value == root.value) {
                //by now we might found our successor
                break;
            } else if (node.value.compareTo(root.value) < 0) {
                successor = root;
                root = root.left;
            } else if (node.value.compareTo(root.value) > 0)
                root = root.right;
        }
        return successor;
    }
//___________________________________________


    public static void main(String[] args) {
        DrzewoBST bst = new DrzewoBST(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        });
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        System.out.println(bst.treeToStringInOrder());
        System.out.println(bst.treeToStringPreOrder());
        System.out.println(bst.treeToStringPostOrder());
        System.out.println("Max: " + bst.maxvalue(bst.root).value);
        System.out.println("Min: " + bst.minvalue(bst.root).value);
        System.out.println("Następnik korzenia '" + bst.root.value + "': " + bst.successor(bst.root, bst.root).value);
        System.out.println("Poprzednik korzenia '" + bst.root.value + "': " + bst.predecessor(bst.root, bst.root).value);
        System.out.println(bst.search(3).value.toString());
        System.out.println("Następnik '" + bst.search(3).value + "' " + bst.successor(bst.root, bst.search(3)).value.toString());
        System.out.println("Poprzednik '" + bst.search(3).value + "' " + bst.predecessor(bst.root, bst.search(3)).value.toString());


    }
}
