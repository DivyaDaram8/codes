package DSA.Graphs;

import java.util.ArrayList;

public class GraphCreate {

    /*

            1 --- 3
           /      | \
          /       |  \
         0        |   5 --- 6
          \       |  /
           \      | /
            2 --- 4

    */

    public static ArrayList<Edge>[] createGraph() {
        int v = 7; // Number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Neighbours of 0
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));

        // Neighbours of 1
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 12));

        // Neighbours of 2
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 4, 8));

        // Neighbours of 3
        graph[3].add(new Edge(3, 1, 12));
        graph[3].add(new Edge(3, 4, 5));
        graph[3].add(new Edge(3, 5, 6));

        // Neighbours of 4
        graph[4].add(new Edge(4, 2, 8));
        graph[4].add(new Edge(4, 3, 5));
        graph[4].add(new Edge(4, 5, 2));

        // Neighbours of 5
        graph[5].add(new Edge(5, 3, 6));
        graph[5].add(new Edge(5, 4, 2));
        graph[5].add(new Edge(5, 6, 7));

        // Neighbours of 6
        graph[6].add(new Edge(6, 5, 7));

        return graph;
    }
}