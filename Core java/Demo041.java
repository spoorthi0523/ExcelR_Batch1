package PS003;

import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Convert character to lowercase for simplicity
                ch = Character.toLowerCase(ch);

                // Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println(ch + " is not a valid alphabet character.");
            }
        }
    }
}
