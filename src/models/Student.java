package models;

public class Student extends Person {
    private double gpa; // [cite: 26]

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) { // [cite: 29]
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String getPosition() {
        return "Student"; // [cite: 12]
    }

    @Override
    public double getPaymentAmount() {
        // Стипендия только если gpa > 2.67 [cite: 31]
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString(); // [cite: 27]
    }
}