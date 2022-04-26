package Himanshu.ctcci.ArraysAndString;
import java.util.*;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionOfTwoArrays {

    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            ArrayList<Integer> res = new ArrayList<>();

            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            while(i < nums1.length && j < nums2.length) {
                if(nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                    i += 1;
                    j += 1;
                }
                else {
                    if(nums1[i] < nums2[j]) {
                        i += 1;
                    }
                    else {
                        j += 1;
                    }

                }
            }
            int size = res.size();
            int[] finalres = new int[size];
            for(int k=0 ; k< size; k++) {
                finalres[k] = res.get(k);
            }
            return finalres;
        }
    }
}
