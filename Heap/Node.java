public class Node<T> {
    T key;
    int degree;
    Node<T> parent;
    Node<T> sibling;
    Node<T> child;


    public Node(T k) {
        key = k;
        degree = 0;
        parent = null;
        sibling = null;
        child = null;
    }

    public void print(int level) {
        Node current = this;
        while (current != null) {
            String s = " ";
            for (int i = 0; i < level; i++) {
                s += "-";
            }
            s += current.key;
            System.out.println(s);
            if (current.child != null) {
                current.child.print(level + 1);
            }
            current = current.sibling;
        }
    }
}
