package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.BinaryTree;
import ctci.trees_and_graphs.structure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class IterativeLevelOrderTraversal {
    public static void printLevelOrder(BinaryTree tree) {
        if (null != tree.root) {
            Node root = tree.root;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node node = queue.poll();
                System.out.println(node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        } else {
            System.out.println("Root is null");
        }
    }

    public static void sumOfEachLevel(BinaryTree tree) {
        if (null != tree.root) {
            Node root = tree.root;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int level = -1;
            int currentSum = 0;

            while (true) {
                int queueCount = queue.size();
                if (queueCount == 0) {
                    break;
                }

                level++;
                while (queueCount > 0) {
                    Node node = queue.poll();
                    currentSum = currentSum + node.data;

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                    queueCount--;
                }
                System.out.println("Sum at level " + level + " = " + currentSum);
                currentSum = 0;
            }
        }
    }
}
