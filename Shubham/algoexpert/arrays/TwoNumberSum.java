package algoexpert.arrays;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) {
                return new int[]{arr[left], arr[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
