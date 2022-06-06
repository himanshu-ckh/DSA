package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class InsertUsingLevelOrder {
    public static void insertElement(Node root, int element) {
        if (root == null) {
            root = new Node(element);
        } else {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                if (node.left == null) {
                    node.left = new Node(element);
                    return;
                } else {
                    queue.add(node.left);
                }
                if (node.right == null) {
                    node.right = new Node(element);
                    return;
                } else {
                    queue.add(node.right);
                }
            }
        }
    }
}
