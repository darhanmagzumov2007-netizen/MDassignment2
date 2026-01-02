import models.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(); // [cite: 35]

        people.add(new Employee("Aibar", "Erkebulan", "Lawyer", 27045.78));
        people.add(new Employee("Sultanbek", "Aibekuly", "Builder", 50000.00));
        people.add(new Student(" Beybarys", "Starr", 2.0)); // Без стипендии
        people.add(new Student("Erasyl", "Abdarakhamanov", 3.5)); // Со стипендией


        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {

            System.out.println(p.toString() + " earns " + String.format("%.2f", p.getPaymentAmount()) + " tenge");
        }
    }
}