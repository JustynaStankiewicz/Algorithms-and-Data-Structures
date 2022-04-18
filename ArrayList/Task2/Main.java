public class Main {
    public static void main(String[] args) {

        System.out.println("Studenci");
        StudentList studenci = new StudentList(7);

        studenci.dopiszStudenta(new Student("Jan", 222300));
        studenci.dopiszStudenta(new Student("Jan", 122500));
        studenci.dopiszStudenta(new Student("Marcin", 260301));
        studenci.dopiszStudenta(new Student("Robert", 245000));
        studenci.dopiszStudenta(new Student("Maja", 260401));
        studenci.dopiszStudenta(new Student("Zuzanna", 100300));
        System.out.println(studenci);
        studenci.dopiszStudenta(new Student("Marcin", 260301));
        studenci.dopiszStudenta(new Student("Marek", 259000));
        System.out.println(studenci);

        System.out.println("Sortowanie po imieniu:");
        studenci.sort_Name();
        System.out.println("\nSortowanie po indeksie");
        studenci.sort_IndexNo();


        System.out.println("Punkty");
        PunktList punkty = new PunktList();
        punkty.dopiszPunkt(new Punkt(0, 0));
        punkty.dopiszPunkt(new Punkt(1, 2));
        punkty.dopiszPunkt(new Punkt(-1, 2));
        System.out.println(punkty);
        punkty.dopiszPunkt(new Punkt(1, -3));
        punkty.dopiszPunkt(new Punkt(0, -1.3));
        punkty.dopiszPunkt(new Punkt(-1, -2.2));
        System.out.println(punkty);

        System.out.println("Sortowanie:");
        punkty.sort();


    }
}
