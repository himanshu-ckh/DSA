package Himanshu.ctcci.ArraysAndString;
//https://leetcode.com/problems/search-a-2d-matrix/
public class Searcha2DMatrixSorted {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // for(int i=0; i< rows; i++) {
            //     for(int j=0; j<cols; j++) {
            //         if(target>matrix[i][cols-1]) {
            //             j=cols;
            //         }
            //         else {
            //             if(matrix[i][j] == target) {
            //                 return true;
            //             }
            //         }
            //     }
            // }

            int last = rows * cols -1;
            int first = 0;
            int index, element;
            while(first <= last) {
                index = (last + first) / 2;
                element = matrix[index / cols][index % cols];
                if(target == element) {
                    return true;
                }
                else {
                    if(target < element) {
                        last = index - 1;
                    }
                    else {
                        first = index + 1;
                    }
                }
            }
            return false;
        }
    }
}
