public class PriorityQueue {

    //Skladowe
    Edge[] heap;
    int pos;

    //Konstruktor
    private PriorityQueue() {
    }

    public PriorityQueue(int n) {
        heap = new Edge[n];
        pos = 0;
    }

    //Metody
    public Edge front() {
        return heap[0];
    }

    public void pop() {
        int i, j;
        Edge e;
        if (pos != 0) {
            e = heap[--pos];
            i = 0;
            j = 1;
            while (j < pos) {
                if ((j + 1 < pos) && (heap[j + 1].getWeight() < heap[j].getWeight())) {
                    j++;
                }
                if (e.getWeight() <= heap[j].getWeight()) {
                    break;
                }
                heap[i] = heap[j];
                i = j;
                j = (j << 1) + 1;
            }
            heap[i] = e;
        }
    }

    public void push(Edge e) {
        int i, j;
        i = pos++;
        j = (i - 1) >> 1;

        while ((i != 0) && (heap[j].getWeight() > e.getWeight())) {
            heap[i] = heap[j];
            i = j;
            j = (i - 1) >> 1;
        }
        heap[i] = e;
    }
}
