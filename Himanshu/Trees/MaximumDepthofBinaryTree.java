package Himanshu.ctcci.Trees;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthofBinaryTree {

    //Definition for a binary tree node.
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
        int maxDepth = 0;
        List<List<Integer>> ele = new ArrayList<List<Integer>>();

        private void getMaxDepth(TreeNode root, int level) {
            if(level == ele.size()) {
                maxDepth ++;
                ele.add(new ArrayList<Integer>());
            }
            ele.get(level).add(root.val);

            if(root.left != null)
                getMaxDepth(root.left, level+1);
            if(root.right != null)
                getMaxDepth(root.right, level+1);

        }

        public int maxDepth(TreeNode root) {
            if(root == null) return 0;
            getMaxDepth(root, 0);
            return maxDepth;
            // else {
            //     int left = maxDepth(root.left);
            //     int right = maxDepth(root.right);
            //     return java.lang.Math.max(left, right) + 1;
            // }
        }
    }
}
