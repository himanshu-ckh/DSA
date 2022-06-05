package ctci.trees_and_graphs.general.trees;

import ctci.trees_and_graphs.structure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteFromBinaryTree {
    public static void delete(int key, Node root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node toDelete = null;
        Node last = null;

        while (!queue.isEmpty()) {
            last = queue.poll();
            if (last.data == key) {
                toDelete = last;
            }

            if (last.left != null) {
                queue.add(last.left);
            }
            if (last.right != null) {
                queue.add(last.right);
            }
        }

        toDelete.data = last.data;
        System.out.println(root);
        deleteDeepest(root, last);
    }


    private static void deleteDeepest(Node root,
                                      Node delNode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        Node temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right!=null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }
}
