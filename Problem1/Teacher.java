package Problem1;

public class Teacher extends Person {
    private String subject; // Subject taught by the teacher
    private double salary;  // Annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call the constructor of the Person superclass
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
