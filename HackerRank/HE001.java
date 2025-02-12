package HackerRank;

import java.util.*;

public class HE001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Set<Integer> present = new HashSet<>();

        int mex = 0;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            present.add(arr[i]);

            while (present.contains(mex)) {
                mex++;
            }

            result.add(mex);
        }

        System.out.println("MEX for each prefix of the array: ");
        for (int mexValue : result) {
            System.out.print(mexValue + " ");
        }
    }
}
