package ctci.trees_and_graphs.general.graphs;

import ctci.trees_and_graphs.structure.Graph;

import java.util.LinkedList;

public class DepthFirstSearch {
    public static void dfs(int source, Graph graph) {
        boolean[] visited = new boolean[graph.vertices];

        dfsHelper(source, visited, graph);
    }

    private static void dfsHelper(int source, boolean[] visited, Graph graph) {
        visited[source] = true;
        System.out.println(source);
        LinkedList<Integer> neighbours = graph.adj[source];
        for (Integer neihbour: neighbours) {
            if (!visited[neihbour]) {
                dfsHelper(neihbour, visited, graph);
            }
        }
    }
}
