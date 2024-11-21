package Problem4;

// Abstract Shape class
public abstract class Shape {
    private String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // Overridden toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
