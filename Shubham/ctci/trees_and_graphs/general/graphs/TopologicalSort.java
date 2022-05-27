package ctci.trees_and_graphs.general.graphs;

import ctci.trees_and_graphs.structure.Graph;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {

    public static void topologicalSort(Graph graph, int v) {
        boolean[] visited = new boolean[v];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topologicSortHelper(graph, v, i, stack, visited);
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    private static void topologicSortHelper(Graph graph, int v, int source,
                                            Stack<Integer> stack, boolean[] visited) {
        visited[source] = true;

        LinkedList<Integer> neighbours = graph.adj[source];
        for (Integer neighbour: neighbours) {
            if (!visited[neighbour]) {
                topologicSortHelper(graph, v, neighbour, stack, visited);
            }
        }
        stack.push(source);
    }
}
