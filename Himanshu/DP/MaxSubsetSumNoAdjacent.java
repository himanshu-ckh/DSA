package Himanshu.ctcci.DP;
import java.util.*;

//https://www.algoexpert.io/questions/max-subset-sum-no-adjacent
public class MaxSubsetSumNoAdjacent {


    static class Program {
        public static int maxSubsetSumNoAdjacent(int[] array) {
            // Write your code here.

            if(array.length == 0) {
                return 0;
            } else if (array.length == 1) {
                return array[0];
            }

            int[] max = array.clone();
            max[1] = Math.max(array[0], array[1]);
            for(int i=2; i<array.length; i++) {
                max[i] = Math.max(max[i-1], max[i-2] + array[i]);
            }
            return max[array.length - 1];
        }
    }

}
