import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

        System.out.print("Enter the pattern to search: ");
        String pattern = sc.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();

        String result = original.replace(pattern, replacement);

        System.out.println("Resulting string: " + result);

        sc.close();
    }
}
