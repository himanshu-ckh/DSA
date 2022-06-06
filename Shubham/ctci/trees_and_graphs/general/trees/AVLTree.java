package ctci.trees_and_graphs.general.trees;

public class AVLTree {
    int value;
    int height;
    AVLTree left;
    AVLTree right;

    public AVLTree(int value) {
        this.value = value;
        this.height = 0;
    }

    public static int height(AVLTree tree) {
        if (tree == null) {
            return -1;
        }
        return 1 + Math.max(height(tree.left), height(tree.right));
    }

    public static int getBalanceFactor(AVLTree tree) {
        if (tree == null) {
            return 0;
        }
        return height(tree.left) - height(tree.right);
    }

    public static AVLTree leftRotate(AVLTree x) {
        AVLTree y = x.right;
        AVLTree B = y.left;

        y.left = x;
        x.right = B;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    public static AVLTree rightRotate(AVLTree y) {
        AVLTree x = y.left;
        AVLTree B = x.right;

        x.right = y;
        y.left = B;

        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    public static AVLTree insert(int value, AVLTree tree) {
        if (tree == null) {
            return new AVLTree(value);
        }

        if (value < tree.value) {
            tree.left = insert(value, tree.left);
        } else if (value > tree.value) {
            tree.right = insert(value, tree.right);
        } else {
            return tree;
        }

        tree.height = 1 + Math.max(height(tree.left), height(tree.right));
        int balance = getBalanceFactor(tree);

        if (balance > 1 && value < tree.left.value) {
            return rightRotate(tree);
        }
        if (balance < -1 && value > tree.right.value) {
            return leftRotate(tree);
        }
        if (balance > 1 && value > tree.left.value) {
            tree.left = leftRotate(tree.left);
            return rightRotate(tree);
        }
        if (balance < -1 && value < tree.right.value) {
            tree.right = rightRotate(tree.right);
            return leftRotate(tree);
        }

        return tree;
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree(29);
        tree = insert(26, tree);
        tree = insert(23, tree);

        System.out.println(tree);
    }
}
