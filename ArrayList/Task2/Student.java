public class Student {
    private String name;
    private long indexNo;

    public Student(String name, long IndexNo) {
        this.name = name;
        this.indexNo = IndexNo;
    }


    public String getName() {
        return name;
    }

    public long getIndexNo() {
        return indexNo;
    }

    public String toString() {
        return "imie:" + name + "  numer indeksu:" + indexNo;
    }
}
