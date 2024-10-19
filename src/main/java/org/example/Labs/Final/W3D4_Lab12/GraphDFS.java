package org.example.Labs.Final.W3D4_Lab12;

import java.util.LinkedList;

public class GraphDFS {
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(9);

        // Add edges based on the graph provided
        graph.addEdge(0, 1); // A - B
        graph.addEdge(0, 2); // A - C
        graph.addEdge(0, 5); // A - F
        graph.addEdge(2, 5); // C - F
        graph.addEdge(2, 6); // C - G
        graph.addEdge(3, 4); // D - E
        graph.addEdge(4, 8); // E - I
        graph.addEdge(5, 7); // F - H

        System.out.println("Components of the graph:");
        graph.findComponents();
    }
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    public GraphDFS(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
        adjacencyList[w].add(v);
    }

    // DFS to find all components
    public void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adjacencyList[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    // Find all connected components
    public void findComponents() {
        boolean[] visited = new boolean[vertices];
        for (int v = 0; v < vertices; ++v) {
            if (!visited[v]) {
                System.out.print("Component: ");
                DFSUtil(v, visited);
                System.out.println();
            }
        }
    }
}
