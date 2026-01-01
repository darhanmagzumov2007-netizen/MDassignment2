package models;

public class Employee extends Person {
    private String position; // [cite: 17]
    private double salary;   // [cite: 18]

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) { // [cite: 21]
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getPaymentAmount() {
        return salary; // [cite: 31]
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString(); // [cite: 19]
    }
}