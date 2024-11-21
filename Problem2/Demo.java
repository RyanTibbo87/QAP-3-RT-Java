package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Create a Point object
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);

        // Create a MovablePoint object
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint before move: " + movablePoint);

        // Move the MovablePoint
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint);

        // Set new speed and move again
        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move();
        System.out.println("MovablePoint after setting speed and moving: " + movablePoint);
    }
}
