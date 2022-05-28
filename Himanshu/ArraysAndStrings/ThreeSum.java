package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//https://www.algoexpert.io/questions/three-number-sum
public class ThreeSum {
    static class Program {
        public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
            // Write your code here.
            Arrays.sort(array);
            List<Integer[]> res = new ArrayList<>();
            for(int i=0; i<array.length - 2; i++) {
                int left = i+1;
                int right = array.length -1;

                while(left < right) {
                    int currSum = array[i] + array[left] + array[right];
                    if(currSum == targetSum) {
                        Integer[] small = {array[i], array[left], array[right]};
                        res.add(small);
                        left++;
                        right--;
                    }
                    else if (currSum < targetSum) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
            return res;
        }
    }

}
