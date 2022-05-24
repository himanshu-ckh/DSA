package ctci.trees_and_graphs.structure;

import java.util.LinkedList;

public class Graph {
    public LinkedList<Integer>[] adj;
    public int vertices;
    public int[] parents;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        parents = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
            parents[i] = -1;
        }
    }

    public void insertEdge(int startVertex, int endVertex, boolean twoWay) {
        if (adj[startVertex] == null) {
            adj[startVertex] = new LinkedList<>();
            if (!adj[startVertex].contains(endVertex)) {
                adj[startVertex].add(endVertex);
            }
        } else {
            if (!adj[startVertex].contains(endVertex)) {
                adj[startVertex].add(endVertex);
            }
        }

        if (twoWay) {
            if (adj[endVertex] == null) {
                adj[endVertex] = new LinkedList<>();
                if (!adj[endVertex].contains(startVertex)) {
                    adj[endVertex].add(startVertex);
                }
            } else {
                if (!adj[endVertex].contains(startVertex)) {
                    adj[endVertex].add(startVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.insertEdge(0, 1, true);
        graph.insertEdge(1, 0, false);
        graph.insertEdge(1, 2, false);
        System.out.println(graph);
    }
}
