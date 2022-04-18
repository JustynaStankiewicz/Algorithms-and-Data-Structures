package Task1;


public class HeapSort implements Algorytm {

    private Returned returned = new Returned(0, 0, 0);

    @Override
    public Returned sort(Comparable[] tablica) {
        long czasStart = System.currentTimeMillis();
        sortHeap(tablica);
        long czasDzialania = System.currentTimeMillis() - czasStart;
        returned.czas = czasDzialania;
        return returned;
    }

    public void sortHeap(Comparable arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Comparable temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(Comparable arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l].compareTo(arr[largest]) > 0)
            largest = l;
        returned.liczbaPorownan++;

        // If right child is larger than largest so far
        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;
        returned.liczbaPorownan++;


        // If largest is not root
        if (largest != i) {
            Comparable swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            returned.liczbaPrzesuniec++;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }

    }

    /* A utility function to print array of size n */
    static void printArray(Comparable arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    @Override
    public String toString() {
        return "HeapSort";
    }

    // Driver code
    public static void main(String args[]) {
        Integer arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        HeapSort ob = new HeapSort();
        ob.sortHeap(arr);
        System.out.println("Sorted array is");
        printArray(arr);
        ob.sort(arr);
        System.out.println(ob.returned.toString());


        ob = new HeapSort();
        String tablicaLiter[] = {"j", "u", "s", "i", "a"};
        System.out.println("Array: ");
        printArray(tablicaLiter);
        ob.sortHeap(tablicaLiter);
        System.out.println("Sorted array is");
        printArray(tablicaLiter);
        ob.sort(tablicaLiter);
        System.out.println(ob.returned.toString());

    }

}
