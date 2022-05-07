package Himanshu.ctcci.Trees;
import java.util.*;
//https://www.algoexpert.io/questions/Find%20Closest%20Value%20In%20BST
public class FindClosestInBinarySearchTree {
    static class Program {

        public static int findClosestValueInBst(BST tree, int target) {
            int close = Integer.MAX_VALUE;
            int res = -1;

            res = findCloseset(tree, target, close, res);
            return res;
        }
        public static int findCloseset(BST tree, int target, int close, int res){
            // Write your code here.
            if(Math.abs(target - tree.value) < close) {
                close = Math.abs(target - tree.value);
                res = tree.value;
            }

            if(tree.value > target && tree.left != null) {
                res = findCloseset(tree.left, target, close, res);
            }
            else if(tree.value < target && tree.right != null) {
                res = findCloseset(tree.right, target, close, res);
            }

            return res;
        }

        static class BST {
            public int value;
            public BST left;
            public BST right;

            public BST(int value) {
                this.value = value;
            }
        }
    }

}
