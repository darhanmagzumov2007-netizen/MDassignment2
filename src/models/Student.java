package models;
public class Student extends Person {
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double Payment() {
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    @Override
    public String getPosition() {
        return "";
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}

