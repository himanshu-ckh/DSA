package Himanshu.ctcci.ArraysAndString;
//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int s1 = 0;
//         int s2 = 0;
//         for(int i=m ; i<nums1.length; i++) {
//             nums1[i] = nums2[s2];
//             s2 += 1;
//         }
//         Arrays.sort(nums1);
            int p1 = 0;
            int p2 = 0;
            int[] copy = new int[m];
            for(int i=0; i<m; i++) {
                copy[i] = nums1[i];
            }

            for(int j=0; j<nums1.length; j++) {
                if(p2 >= n || p1 < m && copy[p1] < nums2[p2]) {
                    nums1[j] = copy[p1++];
                }
                else {
                    nums1[j] = nums2[p2++];
                }
            }
        }

    }
}
