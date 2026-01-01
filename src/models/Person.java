package models;

// Используем abstract class, так как у нас есть поля и реализация
public abstract class Person implements Payable, Comparable<Person> { // [cite: 32, 43]
    private static int id_gen = 1; // [cite: 6]
    private final int id;          // [cite: 6]
    private String name;           // [cite: 7]
    private String surname;        // [cite: 8]

    // Конструктор по умолчанию
    public Person() { // [cite: 11]
        this.id = id_gen++;
    }

    // Параметризованный конструктор
    public Person(String name, String surname) { // [cite: 11]
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }

    // Абстрактный метод getPosition, чтобы дети его реализовали
    public abstract String getPosition(); // [cite: 12]

    @Override
    public String toString() {
        return id + ". " + name + " " + surname; // [cite: 9]
    }

    @Override
    public int compareTo(Person other) { // [cite: 45]
        // Сравниваем по сумме выплат
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}