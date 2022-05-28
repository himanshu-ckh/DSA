package ctci.trees_and_graphs.structure;

public class BinaryTree {
    public Node root;

    public BinaryTree(int key) {
        this.root = new Node(key);
    }

    public BinaryTree() {
        this.root = null;
    }

}
