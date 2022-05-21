package Himanshu.ctcci.Trees;
import java.util.*;
public class FindSuccessor {

    static class Program {
        // This is an input class. Do not edit.
        final List<BinaryTree> res = new ArrayList<>();
        static class BinaryTree {
            public int value;
            public BinaryTree left = null;
            public BinaryTree right = null;
            public BinaryTree parent = null;

            public BinaryTree(int value) {
                this.value = value;
            }
        }

        public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
            // Write your code here.
            if(tree == null) {
                return null;
            }

            findSuccessor(tree.left,  node);
            res.add(tree);
            findSuccessor(tree.right, node);

            for(int i=0; i<res.size(); i++) {
                if(node.value == res.get(i).value && i<res.size()-1) {
                    return res.get(i+1);
                }
            }

            return null;
        }
    }

}
