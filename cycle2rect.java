public class cycle2rect {
    
    private double length;
    private double width;

    public cycle2rect() {
        this.length = 1;
        this.width = 1;
    }

  
    public cycle2rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1 (default):");
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        Rectangle rect2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2 (5 x 3):");
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());

       
        Rectangle rect3 = new Rectangle(10.5, 4.2);
        System.out.println("\nRectangle 3 (10.5 x 4.2):");
        System.out.println("Area: " + rect3.calculateArea());
        System.out.println("Perimeter: " + rect3.calculatePerimeter());
    }
}
