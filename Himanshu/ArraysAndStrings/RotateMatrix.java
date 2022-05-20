package Himanshu.ctcci.ArraysAndString;

import java.util.Arrays;

public class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] rotatedMatrix = new int[size][size];
        int row = 0;
        int rotCol = size - 1;

        while(row < size) {
            for(int i=0; i<size; i++) {
                rotatedMatrix[i][rotCol] = matrix[row][i];
            }
            row++;
            rotCol--;
        }
        return rotatedMatrix;
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
