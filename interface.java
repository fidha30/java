// Define the Shape interface
interface Shape {
    double calculateArea();
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override calculateArea
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate polymorphism
public class Shape {
    public static void main(String[] args) {
        // Create Shape references
        Shape triangle = new Triangle(10, 5);
        Shape rectangle = new Rectangle(8, 4);

        // Call calculateArea using polymorphism
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
