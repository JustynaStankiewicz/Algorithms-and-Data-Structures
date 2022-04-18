import java.util.Comparator;

public class StudentComparator_IndexNo implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getIndexNo() - (o2.getIndexNo()));
    }

}
