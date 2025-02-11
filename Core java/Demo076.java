import java.util.Arrays;

class SecondMax {
    int[] array = { 10, 20, 30, 40, 50 };

    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    void display() {

        System.out.println("Original array: " + Arrays.toString(array));

        int secondMax = findSecondMax(array);

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second maximum number: " + secondMax);
        } else {
            System.out.println("No second maximum number found");
        }
    }

}

public class Demo076 {
    public static void main(String[] args) {
        SecondMax obj = new SecondMax();
        obj.display();
    }
}