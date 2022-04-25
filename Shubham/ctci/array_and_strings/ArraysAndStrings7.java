package ctci.array_and_strings;

import java.util.Arrays;

public class ArraysAndStrings7 {
    public static int[][] rotateMatrixBruteForce(int[][] matrix) {
        int size = matrix.length;
        int[][] rotatedMatrix = new int[size][size];

        int row = 0;
        int rotCol = size - 1;

        while (row < size) {
            for (int col = 0; col < size; col++) {
                rotatedMatrix[col][rotCol] = matrix[row][col];
            }
            row++;
            rotCol--;
        }

        return rotatedMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateMatrixBruteForce(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
