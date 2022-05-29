package Himanshu.ctcci.ArraysAndString;

//https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchInA2DMatrix_240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = 0;
            int cols = matrix[0].length -1;
            while(row <= matrix.length -1  && cols >=0) {
                if(matrix[row][cols] > target) {
                    System.out.println(matrix[row][cols]);
                    cols = cols -1;
                }
                else if(matrix[row][cols] < target) {
                    System.out.println(matrix[row][cols]);
                    row = row + 1;
                }
                else {
                    return true;
                }
            }
            return false;
        }
    }
}
