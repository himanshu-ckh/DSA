/**

 *https://leetcode.com/problems/boundary-of-binary-tree/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    List<Integer> res = new LinkedList<>();
    
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null)
            return res;
        res.add(root.val);
        addLeftBoundary(root.left);
        addLeaves(root.left);
        addLeaves(root.right);
        addRightBoundary(root.right);
        return res;
    }
    
    private void addLeftBoundary(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return;
        res.add(root.val);
        if (root.left != null)
            addLeftBoundary(root.left);
        else
            addLeftBoundary(root.right);
    }
    
    private void addLeaves(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            res.add(root.val);
        else {
            addLeaves(root.left);
            addLeaves(root.right);   
        }
    }
    
    private void addRightBoundary(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return;
        if (root.right != null)
            addRightBoundary(root.right);
        else
            addRightBoundary(root.left);
        res.add(root.val);
    }
}


/*

          1
	/   \
      2      3                    
     /\      /  
    4  5     6 	
       /\    /\
      7  8   9 10


O/P: [1,2,4,7,8,9,10,6,3]

*/