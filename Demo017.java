package PS003;

import java.util.Scanner;

public class Demo017 {
    public static int addDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            int x = sc.nextInt();

            int sum = addDigits(x);
            System.out.println("Sum of digits " + x + " = " + sum);
        }
    }
}
