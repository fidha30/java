import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the Fibonacci sequence: ");
        int limit = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: " + a + ", " + b);

        while (true) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            System.out.print(", " + next);
            a = b;
            b = next;
        }

        sc.close();
    }
}
