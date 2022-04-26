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

    public static int[][] rotateMatrixInPlace(int[][] matrix) {
        int start = 0;
        int end = 0;

        int totalIterations = matrix.length/2;
        int i = 0;
        int mainSize = matrix.length;
        int size = matrix.length;

        while (i < totalIterations) {
            rotateMatrixRecursive(matrix, start, end, size, mainSize);
            i++;
            start++;
            end++;
            size = size - 2;
        }

        return matrix;
    }

    private static void rotateMatrixRecursive(int[][] matrix, int row, int col, int size, int mainSize) {
        for (int c = col; c < size + col - 1; c++) {
            rotateFourElements(matrix, row, c, size, mainSize);
        }
    }

    private static void rotateFourElements(int[][] matrix, int row, int col, int size, int mainSize) {
        int prevRow = row;
        int prevCol = col;
        int currentVal = matrix[row][col];

        while (true) {
            int nextRow = col;
            int nextCol = (row != 0 && col != 0 && row != mainSize-1 && col != mainSize-1) ? size - row + 1 : size - row - 1;

            int nextVal = matrix[nextRow][nextCol];
            matrix[nextRow][nextCol] = currentVal;
            currentVal = nextVal;

            if (nextRow == prevRow && nextCol == prevCol) {
                break;
            }
            row = nextRow;
            col = nextCol;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateMatrixBruteForce(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(rotateMatrixInPlace(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.deepToString(rotateMatrixBruteForce(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}})));
        System.out.println(Arrays.deepToString(rotateMatrixInPlace(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}})));
        System.out.println(Arrays.deepToString(rotateMatrixBruteForce(new int[][]{{6, 7}, {8, 9}})));
        System.out.println(Arrays.deepToString(rotateMatrixInPlace(new int[][]{{6, 7}, {8, 9}})));

        System.out.println(Arrays.deepToString(rotateMatrixBruteForce(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}})));
        System.out.println(Arrays.deepToString(rotateMatrixInPlace(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}})));


    }
}
