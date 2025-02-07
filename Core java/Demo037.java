package PS003;

import java.util.Scanner;

//greatest among 4 numbers
public class Demo037 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();
            System.out.print("Enter fourth number: ");
            int num4 = scanner.nextInt();

            int max = num1;

            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            if (num4 > max) {
                max = num4;
            }

            System.out.println(max + " is the biggest number.");
            // int[] numbers = new int[4];
            // for (int i = 0; i < 4; i++) {
            // System.out.print("Enter number " + (i + 1) + ": ");
            // numbers[i] = scanner.nextInt();
            // }
            // int max = numbers[0];
            // for (int i = 1; i < 4; i++) {
            // if (numbers[i] > max) {
            // max = numbers[i];
            // }
            // }
            // System.out.println(max + " is the biggest number.");
        }
    }
}
