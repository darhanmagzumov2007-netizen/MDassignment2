package models;

public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = id;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    @Override
    public String toString() {
        return id + "." + name + "." + surname;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}