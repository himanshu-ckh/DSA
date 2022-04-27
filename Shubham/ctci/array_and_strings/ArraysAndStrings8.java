package ctci.array_and_strings;

import java.util.Arrays;

public class ArraysAndStrings8 {

    public static void main(String[] args) {
        boolean[][] matrix = {{true, false, false}, {false, false, false}, {false, false, true}};
        convertToZeroMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void convertToZeroMatrix(boolean[][] matrix) {
        boolean rowZero = false;
        boolean colZero = false;

        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i]) {
                rowZero = true;
                break;
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j][0]) {
                colZero = true;
                break;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j]) {
                    matrix[i][0] = true;
                    matrix[0][j] = true;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = true;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = true;
                }
            }
        }

        if (rowZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = true;
            }
        }

        if (colZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = true;
            }
        }

    }
}
