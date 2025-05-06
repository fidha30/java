import java.util.Scanner;

public class rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

 
        double area = length * width;                
        double perimeter = 2 * (length + width);      
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        sc.close();
    }
}
