package Problem4;

public class Circle extends Ellipse {

    // Constructor for Circle (uses Ellipse constructor)
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    // No additional scaling logic needed as Circle relies on Ellipse's scaling
}
