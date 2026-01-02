import models.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Employee("Aibar", "Erkebulan", "Lawyer", 26512.78));
        list.add(new Employee("Sultanbek", "Aibekuly", "Builder", 52342.00));
        list.add(new Student(" Batyrkhan", "Manarbekuly", 2.16));
        list.add(new Student("Erasyl", "Abdarakhamanov", 4.0));


        Collections.sort(list);

        printData(list);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p: people) {

            System.out.println(p.toString() + " earns " + String.format("%s", p.getPaymentAmount()) + " tenge");
        }
    }
}