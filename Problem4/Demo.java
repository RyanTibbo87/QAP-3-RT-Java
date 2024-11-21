package Problem4;

public class Demo {
    // Static method to scale all objects in an array
    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }

    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[4];

        // Add objects of different shapes
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 4.0);

        // Print shapes before scaling
        System.out.println("Before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale shapes
        scaleShapes(shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\nAfter scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }
}
