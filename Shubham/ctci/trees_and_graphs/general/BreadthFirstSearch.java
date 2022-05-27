package ctci.trees_and_graphs.general;


import ctci.trees_and_graphs.structure.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void bfs(int source, Graph graph) {
        boolean[] visited = new boolean[graph.vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        System.out.println(source);

        while (!queue.isEmpty()) {
            int poll = queue.poll();

            LinkedList<Integer> neighbours = graph.adj[poll];
            for (Integer neighbour: neighbours) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    graph.parents[neighbour] = poll;
                    System.out.println(neighbour);
                }
            }
        }
    }
}
