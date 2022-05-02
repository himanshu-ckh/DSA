package Himanshu.ctcci.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        final List<Integer> res = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            if(root == null) {
                return res;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
            return res;
        }
    }
}
