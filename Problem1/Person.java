package Problem1;

public class Person {
    protected String myName; // Name of the person
    protected int myAge;     // Age of the person
    protected String myGender; // Gender ("M" for male, "F" for female)

    // Constructor
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters and Setters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // toString Method
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}

