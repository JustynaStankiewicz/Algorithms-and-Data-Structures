package Task1;

public class Node {
    Comparable value;
    Node left;
    Node parent;
    Node right;

    Node(Comparable value) {
        this.value = value;
        this.left = this.right = null;
        this.parent = null;
    }

    Node(Comparable value, Node lewe, Node prawe, Node rodzic) {
        this.value = value;
        this.left = lewe;
        this.right = prawe;
        this.parent = rodzic;
    }

    //Wyprowadzenie ciagu wartości w porządku in-order
    public String toStringInOrder() {
        String b = "";

        //1.przejdź _InOrder(lewy potomek x)
        if (left != null) b += left.toStringInOrder();
        //2.przetwórz(x):odwiedź węzeł x
        b += " " + value.toString();
        //3.przejdź_InOrder(prawy potomek x)
        if (right != null) b += " " + right.toStringInOrder();

        return b;
    }

    //Wyprowadzenie ciagu wartości w porządku pre-order
    public String toStringPreOrder() {
        String b = "";
        //1.przetwórz(x):odwiedź węzeł x
        b += " " + value.toString();
        //2.przejdź _PreOrder(lewy potomek x)
        if (left != null) b += left.toStringPreOrder();
        //3.przejdź_PreOrder(prawy potomek x)
        if (right != null) b += " " + right.toStringPreOrder();

        return b;
    }

    //Wyprowadzenie ciagu wartości w porządku post-order
    public String toStringPostOrder() {
        String b = "";

        //1.przejdź _PreOrder(lewy potomek x)
        if (left != null) b += left.toStringPostOrder();
        //2.przejdź_PreOrder(prawy potomek x)
        if (right != null) b += " " + right.toStringPostOrder();
        //3.przetwórz(x):odwiedź węzeł x
        b += " " + value.toString();

        return b;
    }

}
