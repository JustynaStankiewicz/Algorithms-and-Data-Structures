import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BinomialHeap<T> {
    private Node<T> head;
    private Node<T> minimum;
    private int size;
    private final Comparator<Object> _comparator;

    public BinomialHeap(Comparator<Object> comp) {
        head = null;
        size = 0;
        _comparator = comp;
    }

    public BinomialHeap(Node<T> head, Comparator<Object> comp) {
        this.head = head;
        _comparator = comp;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }


    //insert
    public void insert(T key) {
        Node<T> node = new Node(key);
        BinomialHeap<T> tempHeap = new BinomialHeap(node, _comparator);
        head = union(tempHeap);
    }

    //minimum
    public void findMin() {
        if (head == null) {
            minimum = null;
        }
        Node<T> min = head;
        Node<T> minPrev = null;
        Node<T> next = min.sibling;
        Node<T> nextPrev = min;
        while (next != null) {
            if (_comparator.compare(next.key, min.key) > 0) {
                min = next;
                minPrev = nextPrev;
            }
            nextPrev = next;
            next = next.sibling;

        }
        minimum = min;
    }

    //extractMin
    public T extractMin() {
        if (head == null) {
            return null;
        }
        T minVal = minimum.key;
        delete(minimum);
        findMin();
        return minVal;
    }


    //union
    public Node<T> union(BinomialHeap<T> heap) {
        Node<T> newHead = merge(this, heap);
        head = null;
        heap.head = null;
        if (newHead == null) {
            return null;
        }
        Node<T> previous = null;
        Node<T> current = newHead;
        Node<T> next = newHead.sibling;

        while (next != null) {
            if (current.degree != next.degree || (next.sibling != null &&
                    next.sibling.degree == current.degree)) {
                previous = current;
                current = next;
            } else {
                if (_comparator.compare(current.key, next.key) > 0) {
                    current.sibling = next.sibling;
                    link(current, next);
                } else {
                    if (previous == null) {
                        newHead = next;
                    } else {
                        previous.sibling = next;
                    }
                    link(next, current);
                    current = next;
                }
            }
            next = current.sibling;
        }
        head = newHead;
        findMin();
        return newHead;
    }


    //decreaseKey
    public void decreaseKey(Node<T> node, T newKey) {
        node.key = newKey;
        bubbleUp(node, false);
    }


    //delete
    public void delete(Node<T> node) {
        node = bubbleUp(node, true);
        if (head == node) {
            removeRoot(node, null);

        } else {
            Node<T> previous = head;
            while (previous.sibling.key != node.key) {
                previous = previous.sibling;
            }
            removeRoot(node, previous);
        }
        findMin();
    }


//Metody pomocnicze_____________________________________________________________________________________________________

    //merge
// pomocniczna metoda, ktora scala H1 i H2 w pojedyncza liste uporzadkowana niemalejaco
    private Node<T> merge(
            BinomialHeap<T> heap1, BinomialHeap<T> heap2) {
        if (heap1.head == null) {
            return heap2.head;
        } else if (heap2.head == null) {
            return heap1.head;
        } else {
            Node<T> head;
            Node<T> temp1 = heap1.head;
            Node<T> temp2 = heap2.head;
            if (heap1.head.degree <= heap2.head.degree) {
                head = heap1.head;
                temp1 = temp1.sibling;
            } else {
                head = heap2.head;
                temp2 = temp2.sibling;
            }

            Node<T> tail = head;
            while (temp1 != null && temp2 != null) {
                if (temp1.degree <= temp2.degree) {
                    tail.sibling = temp1;
                    temp1 = temp1.sibling;
                } else {
                    tail.sibling = temp2;
                    temp2 = temp2.sibling;

                }
                tail = tail.sibling;
            }
            if (temp1 != null) {
                tail.sibling = temp1;
            } else {
                tail.sibling = temp2;
            }
            findMin();
            return head;
        }
    }

    public Node<T> search(T value) {
        List nodes = new ArrayList<>();
        nodes.add(head);
        while (!nodes.isEmpty()) {
            Node<T> current = (Node) nodes.get(0);
            nodes.remove(0);
            if (_comparator.compare(current.key, value) == 0) {
                return current;
            }
            if (current.sibling != null) {
                nodes.add(current.sibling);
            }
            if (current.child != null) {
                nodes.add(current.child);
            }
        }
        return null;
    }

    private Node<T> bubbleUp(Node<T> node, boolean toRoot) {
        Node<T> parent = node.parent;
        while (parent != null && (toRoot || _comparator.compare(node.key, parent.key) > 0)) {
            T temp = (T) node.key;
            node.key = parent.key;
            parent.key = temp;
            node = parent;
            parent = parent.parent;
        }
        findMin();
        return node;
    }


    private void removeRoot(Node<T> root, Node<T> previous) {
        if (root == head) {
            head = root.sibling;
        } else {
            previous.sibling = root.sibling;
        }
        Node<T> rootList = null;//lista korzeni
        Node<T> child = root.child;
        while (child != null) {
            Node<T> next = child.sibling;
            child.sibling = rootList;
            rootList = child;
            child = next;
        }
        BinomialHeap<T> newHeap = new BinomialHeap(rootList, _comparator);
        head = union(newHeap);
    }

    //Binomial-Link: laczenie drzew dwumianowych(ich korzenie maja te same stopnie)
    private void link(Node<T> y, Node<T> z) {
        z.parent = y;
        z.sibling = y.child;
        y.child = z;
        y.degree++;
    }


    public void print() {
        System.out.println("Heap:");
        if (head != null) {
            head.print(0);
        }
    }


    //______________________________________________________________________________________________________________________
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        BinomialHeap<Integer> bh = new BinomialHeap(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        do {
            System.out.println("\n1:Insert\n2:Minimum\n3:ExtractMin\n4:DecreaseKey\n5:Delete\n6.Finish");

            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.print("Enter value: ");
                    int v = scanner.nextInt();
                    bh.insert(v);
                    bh.print();
                    break;
                case 2:
                    System.out.println("Minimum: ");
                    bh.findMin();
                    bh.print();
                    break;
                case 3:
                    System.out.println("Extract minimum: " + bh.extractMin());
                    bh.print();
                    break;
                case 4:
                    System.out.print("Enter the key : ");
                    int oldKey = scanner.nextInt();
                    System.out.print("Enter the new key : ");
                    int newKey = scanner.nextInt();
                    bh.decreaseKey(bh.search(oldKey), newKey);
                    bh.print();
                    break;
                case 5:
                    System.out.print("Enter the key : ");
                    int key = scanner.nextInt();
                    bh.delete(bh.search(key));
                    bh.print();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + number);

            }
        } while (number != 6);
    }
}
