package Himanshu.ctcci.ArraysAndString;
import java.util.LinkedList;
import java.util.Queue;

public class ReshapeTheMatrix {

    static class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int[][] res = new int[r][c];
            Queue<Integer> queue = new LinkedList();
            if(mat.length == 0 || mat.length * mat[0].length != r *c) {
                return mat;
            }
            for(int i=0; i<mat.length; i++) {
                for(int j=0; j<mat[0].length; j++) {
                    queue.add(mat[i][j]);
                }
            }

            for(int k=0; k<r; k++) {
                for(int l=0; l<c; l++) {
                    res[k][l] = queue.remove();
                }
            }

            //Second approach without using queue

//            int rows =0, col = 0;
//            for(int i=0; i<mat.length; i++) {
//                for(int j=0; j<mat[0].length; j++) {
//                    res[rows][col] = mat[i][j];
//                    col ++;
//
//                    if(col == c){
//                        rows ++;
//                        col = 0;
//                    }
//                }
//
//            }

            return res;
        }
    }
}
