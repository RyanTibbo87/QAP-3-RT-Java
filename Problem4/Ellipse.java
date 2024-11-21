package Problem4;

public class Ellipse extends Shape implements Scalable {
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    // Area of ellipse
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Perimeter of ellipse (approximation)
    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis));
    }

    // Scale method
    @Override
    public void scale(double scaleFactor) {
        majorAxis *= scaleFactor;
        minorAxis *= scaleFactor;
    }
}
