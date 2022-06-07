package Himanshu.ctcci.Trees;
import java.util.*;

//https://www.algoexpert.io/questions/find-kth-largest-value-in-bst
public class BST_FindKthLargestValue {
    static class Program {
        // This is an input class. Do not edit.

        static class BST {
            public int value;
            public BST left = null;
            public BST right = null;

            public BST(int value) {
                this.value = value;
            }
        }

        public int findKthLargestValueInBst(BST tree, int k) {
            // Write your code here.
            List<Integer> res = new ArrayList<>();
            res = addValueInList(tree, res);

            int size = res.size();
            int element = size - k;
            return res.get(element);
        }
        public List<Integer> addValueInList(BST tree, List<Integer> res) {
            if(tree == null) {
                return res;
            }

            addValueInList(tree.left, res);
            res.add(tree.value);
            addValueInList(tree.right, res);

            return res;
        }
    }

}
