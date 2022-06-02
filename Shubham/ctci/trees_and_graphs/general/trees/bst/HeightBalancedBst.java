package ctci.trees_and_graphs.general.trees.bst;

public class HeightBalancedBst {
    int value;
    int height;
    HeightBalancedBst left;
    HeightBalancedBst right;

    public HeightBalancedBst(int value) {
        this.value = value;
        this.height = 0;
    }

    public static HeightBalancedBst insert(HeightBalancedBst bst, int value) {
        if (bst == null) {
            return new HeightBalancedBst(value);
        }

        if (bst.value > value) {
            bst.left = insert(bst.left, value);
        } else if (bst.value < value) {
            bst.right = insert(bst.right, value);
        }
        bst.height = 1 + Math.max(bst.left != null ? bst.left.height : 0,
                bst.right != null ? bst.right.height : 0);
        return bst;
    }

    public static void main(String[] args) {
        HeightBalancedBst bst = new HeightBalancedBst(15);
        insert(bst, 13);
        insert(bst, 12);
        insert(bst, 14);
        insert(bst, 22);
        insert(bst, 18);
        insert(bst, 24);
        insert(bst, 17);

        System.out.println(bst);
    }
}
