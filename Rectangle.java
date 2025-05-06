class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
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
        Rectangle rect2 = new Rectangle(5, 3);
        
        System.out.println("Rectangle 1 - Area: " + rect1.calculateArea() + ", Perimeter: " + rect1.calculatePerimeter());
        System.out.println("Rectangle 2 - Area: " + rect2.calculateArea() + ", Perimeter: " + rect2.calculatePerimeter());
    }
}
