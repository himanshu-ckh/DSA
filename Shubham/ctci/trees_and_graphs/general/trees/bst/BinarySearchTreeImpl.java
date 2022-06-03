package ctci.trees_and_graphs.general.trees.bst;

public class BinarySearchTreeImpl {
    int value;
    BinarySearchTreeImpl left;
    BinarySearchTreeImpl right;

    public BinarySearchTreeImpl(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static BinarySearchTreeImpl insert(int n, BinarySearchTreeImpl tree) {
        if (tree == null) {
            tree = new BinarySearchTreeImpl(n);
            return tree;
        }

        if (tree.value > n) {
            tree.left = insert(n, tree.left);
        } else if (tree.value < n) {
            tree.right = insert(n, tree.right);
        }
        return tree;
    }

    public static void inorder(BinarySearchTreeImpl node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public static int findMin(BinarySearchTreeImpl tree) throws Exception {
        if (tree == null) {
            throw new Exception("Empty tree");
        }
        if (tree.left == null) {
            return tree.value;
        }

        return findMin(tree.left);
    }

    public static int findMax(BinarySearchTreeImpl tree) throws Exception {
        if (tree == null) {
            throw new Exception("Empty tree");
        }
        if (tree.right == null) {
            return tree.value;
        }

        return findMax(tree.right);
    }

    public static boolean find(int n, BinarySearchTreeImpl tree) throws Exception {
        if (tree == null) {
            return false;
        }

        if (n == tree.value) {
            return true;
        }
        if (n < tree.value) {
            return find(n, tree.left);
        } else if (n > tree.value) {
            return find(n, tree.right);
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BinarySearchTreeImpl tree = new BinarySearchTreeImpl(2);
        insert(3, tree);
        insert(4, tree);
        insert(6, tree);
        insert(1, tree);
        System.out.println(tree);
        inorder(tree);
        System.out.println(findMin(tree));
        System.out.println(find(5, tree));
        System.out.println(find(4, tree));
        System.out.println(find(1, tree));
        System.out.println(find(6, tree));
        System.out.println(find(5, null));
    }
}
