package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.BinaryTree;
import ctci.trees_and_graphs.structure.Node;

import java.util.Stack;

public class TraversalsUsingDifferentTechniques {
    public static void inorder(Node root) {
        if (root == null)
            return;

        Node current = root;
        Stack<Node> stack = new Stack<>();

        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }

    public static void inorderRecursive(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public static void preorder(BinaryTree tree) {
        if (null == tree.root) {
            return;
        }

        Node root = tree.root;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            Node node = stack.pop();
            System.out.println(node.data);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static void preorderRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preorderRecursive(node.left);
        preorderRecursive(node.right);
    }
}
