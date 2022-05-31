package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.Node;

public class HeightOfBinaryTree {
    public static int heightOfTree(Node root) {
        if (root == null) {
            return -1;
        } else {
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
