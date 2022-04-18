import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyList<T> implements Iterable<T> { // Implementacja Iterable<T>
    Object[] myList;
    int k = 0;

    MyList(int k) {
        myList = (T[]) new Object[k];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {// Anonimowa klasa
            private boolean canRemoveBeCalled;
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {//sprawdza czy sa jeszcze elementy w kolekcji
                return currentIndex < myList.length;
            }

            @Override
            public T next() throws NoSuchElementException {//zwraca kolejny element
                if (hasNext()) {
                    return (T) myList[currentIndex++];
                } else throw new NoSuchElementException();
            }

            @Override
            public void remove() throws IllegalStateException {//usuwa kolejny element
                if (canRemoveBeCalled = false) {
                    throw new IllegalStateException();
                } else {
                    myList[currentIndex] = null;
                    canRemoveBeCalled = false;
                }
            }
        };
    }

    public void add(int index, T element) {
        if (k == myList.length) {
            System.out.println("Brak miejsca");
        } else {
            if (index > 0 && index <= myList.length) {
                myList[index] = element;
                k++;
            } else System.out.println("Blad w indeksie");
        }

    }


    public boolean add(T element) {//dodanie elementu do listy
        int z = 0;
        if (k == myList.length) {
            return false;
        } else {
            for (int i = 0; i < myList.length; i++) {
                if ((myList[i] == null) && (z == 0)) {
                    myList[i] = element;
                    k++;
                    z++;

                }
            }
            return true;
        }
    }


    public void clear() {//usuwa wszystkie elementy kolekcji
        for (int i = 0; i < k; i++) {
            myList[i] = null;

        }
        k = 0;
    }

    public boolean contains(T element) {//czy dany element znajduje sie w kolekcji
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != null) {
                if (myList[i].equals(element)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        Object[] tab2 = new Object[minCapacity];
        for (int i = 0; i < myList.length; i++) {
            tab2[i] = myList[i];
        }
        myList = tab2;
    }


    public T get(int index) {//pobranie elementu z kolekcji z danej pozycji
        T element = null;
        if (index <= myList.length) {
            element = (T) myList[index];
        } else System.out.println("Niepoprawny indeks");
        return element;
    }

    public int indexOf(T element) {//zwraca indeks danego elementu
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != null) {
                if (myList[i].equals(element)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public T set(int index, T element) throws IndexOutOfBoundsException {//zastapienie elementu na danej pozycji
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else for (int i = 0; i < k; i++) {
            if (i == index) {
                myList[i] = element;

            }
        }
        return element;
    }

    public void remove(int index) {//usuwanie elementu z określonej pozycji
        if (index > myList.length) {
            System.out.println("nie ma takiego indeksu w liscie");
        } else {
            myList[index] = null;
            k--;
        }
    }

    public int size() {//sprawdzenie ile elementow jest na liscie
        return k;
    }

    public void list() {
        if (k != 0) {
            for (int i = 0; i < myList.length; i++) {
                if (myList[i] != null) {
                    System.out.println(myList[i].toString());
                }
            }
        } else System.out.println("Lista pusta");
    }


    public static void main(String[] args) {
        System.out.println("Studenci");
        Student st1 = new Student("Marek");
        Student st2 = new Student("Jola");
        Student st3 = new Student("Iza");
        Student st4 = new Student("Tomasz");
        Student st5 = new Student("Filip");
        Student st6 = new Student("Asia");


        MyList<Student> students = new MyList<>(7);
        System.out.println(students.add(st3));
        System.out.println(students.add(st2));
        System.out.println(students.add(st4));
        students.add(3, st1);
        students.list();
        System.out.println(students.size());
        students.clear();
        students.add(4, st5);
        System.out.println(students.add(st6));
        System.out.println(students.size());
        students.list();
        System.out.println(students.contains(st5));
        students.ensureCapacity(8);
        System.out.println(students.get(0));

        students.set(0, new Student("Julia"));
        students.set(1, st1);
        students.list();
        System.out.println(students.indexOf(st1));
        students.remove(1);
        students.list();

    }


}
