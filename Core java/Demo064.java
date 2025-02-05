package PS003;

import java.util.Arrays;

public class Demo064 {
    public static void swapFirstTwoElements(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Before swap: " + Arrays.toString(numbers));

        swapFirstTwoElements(numbers);

        System.out.println("After swap: " + Arrays.toString(numbers));
    }
}
