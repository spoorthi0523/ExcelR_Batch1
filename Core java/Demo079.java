import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 10, 20, 30, 40, 50 };

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        boolean found = false;

        for (int num : array) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}