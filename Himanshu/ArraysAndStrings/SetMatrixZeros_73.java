package Himanshu.ctcci.ArraysAndString;

import java.util.HashSet;
//https://leetcode.com/problems/set-matrix-zeroes/submissions/

/*
In this we use a hashSet and store the value of row and col where we see a 0
Once we update the hashset we iterate through the matrix again and if we encounter the value in the hashset for row and col
we change that index to 0
 */
public class SetMatrixZeros_73 {
    static class Solution {
        public void setZeroes(int[][] matrix) {
            int length = matrix.length;
            int cols = matrix[0].length;

            HashSet<Integer> setRow = new HashSet<>();
            HashSet<Integer> setCol = new HashSet<>();

            for(int i=0; i<length; i++) {
                for(int j=0; j<cols; j++) {
                    if(matrix[i][j] == 0) {
                        setRow.add(i);
                        setCol.add(j);
                    }
                }
            }

            for(int r=0; r<length; r++) {
                for(int c=0; c<cols; c++) {
                    if(setRow.contains(r) || setCol.contains(c)) {
                        matrix[r][c] = 0;
                    }
                }
            }
        }
    }
}
