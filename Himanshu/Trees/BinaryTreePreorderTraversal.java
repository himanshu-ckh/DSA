package Himanshu.ctcci.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    //
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
        final List<Integer> res = new ArrayList<Integer>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if(root == null) {
                return res;
            }

            res.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return res;
        }
    }
}
