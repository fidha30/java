import java.util.Scanner;

public class mark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        int total = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;

        if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || (mathPhysicsTotal >= 150)) {
            System.out.println("The student is eligible for admission.");
        } else {
            System.out.println("The student is NOT eligible for admission.");
        }

        sc.close();
    }
}
