package PS003;

import java.util.Scanner;

//greatest among 2 numbers
public class Demo035 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " is the bigger number.");
            } else if (num2 > num1) {
                System.out.println(num2 + " is the bigger number.");
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    }
}
