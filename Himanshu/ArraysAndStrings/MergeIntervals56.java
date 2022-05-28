package Himanshu.ctcci.ArraysAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/merge-intervals/
//https://www.algoexpert.io/questions/Merge%20Overlapping%20Intervals
public class MergeIntervals56 {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            int[][] sortedIntervals = intervals.clone();

            Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> mergerIntervals = new ArrayList<int[]>();
            int[] currentLevel = sortedIntervals[0];
            mergerIntervals.add(currentLevel);

            for(int[] next: sortedIntervals) {
                int currentLevelEnd = currentLevel[1];
                int nextLevelStart = next[0];
                int nextLevelEnd = next[1];

                if(currentLevelEnd >= nextLevelStart) {
                    currentLevel[1] = Math.max(currentLevelEnd, nextLevelEnd);
                }
                else {
                    currentLevel = next;
                    mergerIntervals.add(currentLevel);

                }
            }
            return mergerIntervals.toArray(new int[mergerIntervals.size()][]);
        }
    }
}
