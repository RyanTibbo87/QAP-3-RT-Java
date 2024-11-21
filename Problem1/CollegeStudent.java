package Problem1;

public class CollegeStudent extends Student {
    private String major; // Major field of study
    private int year;     // Year in college (e.g., 1 = Freshman, 2 = Sophomore)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call the constructor of the Student superclass
        this.year = year;
        this.major = major;
    }

    // Getters and Setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString Method
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
