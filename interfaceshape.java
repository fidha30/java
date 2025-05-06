// Define the Shape interface
interface Shape {
    double calculateArea();
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override calculateArea for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Shape references pointing to Triangle and Rectangle
        Shape triangle = new Triangle(5, 10);
        Shape rectangle = new Rectangle(4, 6);

        // Demonstrate polymorphism: calling calculateArea on Shape references
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
