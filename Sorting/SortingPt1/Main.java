package Task;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList studenci1 = new ArrayList();
        Student pierwszy = new Student(1, "Nowak", "Arek", 5);
        Student drugi = new Student(2, "Kowalski", "Michał", 3.5);
        Student trzeci = new Student(3, "Pawłowski", "Patryk", 2.5);
        Student czwarty = new Student(4, "Kuźniak", "Alicja", 4.5);
        Student piaty = new Student(5, "Fog", "Marta", 5);
        studenci1.add(pierwszy);
        studenci1.add(drugi);
        studenci1.add(trzeci);
        studenci1.add(czwarty);
        studenci1.add(piaty);

    }
}
