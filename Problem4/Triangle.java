package Problem4;

public class Triangle extends Shape implements Scalable {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);

        // Validate the triangle inequality
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Area using Heron's formula
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Perimeter of triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Scale method
    @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
}
