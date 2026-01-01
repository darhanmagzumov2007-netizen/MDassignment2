import models.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(); // [cite: 35]

        people.add(new Employee("John", "Lennon", "Musician", 27045.78));
        people.add(new Employee("George", "Harrison", "Musician", 50000.00));
        people.add(new Student("Ringo", "Starr", 2.0)); // Без стипендии
        people.add(new Student("Paul", "McCartney", 3.5)); // Со стипендией

        // Сортировка на основе compareTo (по деньгам) [cite: 46]
        Collections.sort(people);

        printData(people); // [cite: 36]
    }

    public static void printData(Iterable<Person> people) { // [cite: 37]
        for (Person p : people) {
            // Формат вывода: "Position: ID. Name Surname earns Money" [cite: 39-42]
            System.out.println(p.toString() + " earns " + String.format("%.2f", getPaymentAmount()) + " tenge");
        }
    }
}