package com.dsa.interview.prep;

public class RotateImage {
    public void rotateImage(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){                        //Transpose the matrix
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){                          // Reverse each row and the matrix will be rotated 90degree
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }

/*
Before Rotation
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
After Rotation
[7, 4, 1]
[8, 5, 2]
[9, 6, 3]

 */
    }
}
