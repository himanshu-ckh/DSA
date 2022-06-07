package Himanshu.ctcci.Graphs;
import java.util.*;

//https://www.algoexpert.io/questions/breadth-first-search
public class BreadthFirstSearch {
    static class Program {
        // Do not edit the class below except
        // for the breadthFirstSearch method.
        // Feel free to add new properties
        // and methods to the class.
        static class Node {
            String name;
            List<Node> children = new ArrayList<Node>();

            public Node(String name) {
                this.name = name;
            }

            public List<String> breadthFirstSearch(List<String> array) {
                // Write your code here.

                array.add(this.name);
                Queue<Node> qu = new LinkedList<>();
                for(int i=0; i<children.size(); i++) {
                    qu.add(children.get(i));
                }

                while(!qu.isEmpty()) {
                    Node rem = qu.remove();
                    array.add(rem.name);
                    for(int i=0; i<rem.children.size(); i++) {
                        qu.add(rem.children.get(i));
                    }
                }
                return array;
            }

            public Node addChild(String name) {
                Node child = new Node(name);
                children.add(child);
                return this;
            }
        }
    }

}
