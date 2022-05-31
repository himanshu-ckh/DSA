package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.BinaryTree;
import ctci.trees_and_graphs.structure.Node;

public class RecursiveLevelOrderTraversal {
    public static void printLevelOrder(BinaryTree tree) {
        int height = HeightOfBinaryTree.heightOfTree(tree.root);
        for (int i = 1; i <= height; i++) {
            printEachLevel(tree.root, i);
        }
    }

    private static void printEachLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.println(node.data);
        } else if (level > 1) {
            printEachLevel(node.left, level-1);
            printEachLevel(node.right, level-1);
        }
    }

    public static void sumOfEachLevelUsingRecusion(BinaryTree tree) {
        int height = HeightOfBinaryTree.heightOfTree(tree.root);
        for (int i = 1; i <= height; i++) {
            System.out.println("Printing sum at level : " + i + " is " + sumOfEachLevel(tree.root, i));
        }
    }

    private static int sumOfEachLevel(Node node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return node.data;
        } else if (level > 1) {
            return sumOfEachLevel(node.left, level-1) + sumOfEachLevel(node.right, level - 1);
        }
        return 0;
    }
}
