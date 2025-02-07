package Leetcode;

public class LTCode009 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;

            if (m > n) {
                return findMedianSortedArrays(nums2, nums1);
            }

            int left = 0;
            int right = m;

            while (left <= right) {
                int partitionX = (left + right) / 2;
                int partitionY = (m + n + 1) / 2 - partitionX;

                int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
                int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

                int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
                int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

                if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                    if ((m + n) % 2 == 0) {
                        return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                    } else {
                        return (double) Math.max(maxLeftX, maxLeftY);
                    }
                } else if (maxLeftX > minRightY) {
                    right = partitionX - 1;
                } else {
                    left = partitionX + 1;
                }
            }

            return 0.0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LTCode009().new Solution();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + result);
    }

}
