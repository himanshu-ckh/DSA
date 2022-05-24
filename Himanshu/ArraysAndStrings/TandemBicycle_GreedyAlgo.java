package Himanshu.ctcci.ArraysAndString;
//https://www.algoexpert.io/questions/Tandem%20Bicycle
import java.util.*;
public class TandemBicycle_GreedyAlgo {
    static class Program {

        public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
            // Write your code here.
            int res = 0;
            if(fastest) {
                Arrays.sort(redShirtSpeeds);
                Arrays.sort(blueShirtSpeeds);
                int n = blueShirtSpeeds.length;
                for (int i = 0; i < n / 2; i++) {
                    int temp = blueShirtSpeeds[i];
                    blueShirtSpeeds[i] = blueShirtSpeeds[n - i - 1];
                    blueShirtSpeeds[n - i - 1] = temp;
                }
                for(int i=0; i<redShirtSpeeds.length; i++) {
                    if(redShirtSpeeds[i] > blueShirtSpeeds[i]) {
                        res = res + redShirtSpeeds[i];
                    }
                    else {
                        res = res + blueShirtSpeeds[i];
                    }
                }
            }
            else {
                Arrays.sort(redShirtSpeeds);
                Arrays.sort(blueShirtSpeeds);
                for(int i=0; i<redShirtSpeeds.length; i++) {
                    if(redShirtSpeeds[i] > blueShirtSpeeds[i]) {
                        res = res + redShirtSpeeds[i];
                    }
                    else {
                        res = res + blueShirtSpeeds[i];
                    }
                }
            }
            return res;
        }
    }

}
