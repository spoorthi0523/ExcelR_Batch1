package PS003;

import java.util.Scanner;

public class Demo012 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circle: ");
            double r = sc.nextDouble();

            double area = (r * r * 3.14);

            System.out.println("Area of Circle: " + area);
        }

    }
}
