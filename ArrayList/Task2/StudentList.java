import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentList {
    private int max;
    ArrayList<Student> listaStudentow;

    private final StudentComparator_Name Comparator1;
    private final StudentComparator_IndexNo Comparator2;

    public StudentList(int ilosc) {
        this.max = ilosc;
        listaStudentow = new ArrayList<Student>();
        Comparator1 = new StudentComparator_Name();
        Comparator2 = new StudentComparator_IndexNo();
    }

    public void dopiszStudenta(Student student) {
        if (listaStudentow.size() < getMax()) {
            if (!listaStudentow.contains(student)) {
                listaStudentow.add(student);
            } else {
                System.out.println("Student zostal juz wpisany na liste");
            }
        } else {
            System.out.println("Brak miejsca na liscie!");
        }
    }


    public String toString() {
        String s = "";
        for (Student student : listaStudentow) {
            s += student + "\n";
        }
        return s;
    }

    public void sort_Name() {
        List<Student> lista = new ArrayList<Student>(listaStudentow);
        Collections.sort(lista, Comparator1);
        System.out.println(lista);
    }

    public void sort_IndexNo() {
        List<Student> lista = new ArrayList<Student>(listaStudentow);
        Collections.sort(lista, Comparator2);
        System.out.println(lista);

    }

    public int getMax() {
        return max;
    }

    public ArrayList<Student> getListaStudentow() {
        return listaStudentow;
    }
}
