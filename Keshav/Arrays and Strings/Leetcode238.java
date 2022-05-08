package com.dsa.interview.prep;

public class Leetcode238 {
    public int[] productExceptSelf(int[] nums){
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left[i] = nums[i - 1] * left[i - 1];
        }

        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right[i] = nums[i + 1] * right[i + 1];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = right[i] * left[i];
        }
        return result;
    }

    public static void demo(){
        int[] nums = {1,2,3,4};
        Leetcode238 lc = new Leetcode238();
        int[] answer = lc.productExceptSelf(nums);
        for(int row : answer){
            System.out.print(row + " ");

        }
    }
}
