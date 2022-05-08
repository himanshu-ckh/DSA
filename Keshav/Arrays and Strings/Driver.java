package com.dsa.interview.prep;

public class Driver {
    public static void main(String[] args) {

        RotateImage rotateImage = new RotateImage();
        Util util = new Util();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Rotation");
        util.printMatrix(matrix);
        rotateImage.rotateImage(matrix);
        System.out.println("After Rotation");
        util.printMatrix(matrix);
    }
}
