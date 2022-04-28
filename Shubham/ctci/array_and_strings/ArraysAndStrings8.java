package ctci.array_and_strings;

import java.util.Arrays;

public class ArraysAndStrings8 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 0}, {3, 4, 6}, {7, 0, 8}};
        convertToZeroMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void convertToZeroMatrix(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                makeColZero(matrix, j);
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                makeRowZero(matrix, i);
            }
        }

        if (firstRow) {
            makeRowZero(matrix, 0);
        }
        if (firstCol) {
            makeColZero(matrix, 0);
        }
    }

    public static void makeRowZero(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    public static void makeColZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
