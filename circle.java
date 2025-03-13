import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        double pi = 3.14159;
        
        double area = pi * radius * radius; 
        double perimeter = 2 * pi * radius;   
       
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
        
        sc.close();
    }
}
