import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}
