package Himanshu.ctcci.Trees;
import java.util.*;
public class BranchSum {
    static class Program {
        // This is the class of the input root. Do not edit it.
        public class BinaryTree {
            int value;
            BinaryTree left;
            BinaryTree right;

            BinaryTree(int value) {
                this.value = value;
                this.left = null;
                this.right = null;
            }
        }

        public static List<Integer> branchSums(BinaryTree root) {
            // Write your code here.
            int sum = 0;
            List<Integer> res = new ArrayList<Integer>();
            getSum(root, sum, res);
            return res;
        }

        public static void getSum(BinaryTree root, int sum, List<Integer> res) {
            if(root == null) {
                return;
            }

            sum = sum + root.value;
            if(root.left == null && root.right == null) {
                res.add(sum);
                return;
            }

            getSum(root.left, sum, res);
            getSum(root.right, sum, res);
        }
    }

}
