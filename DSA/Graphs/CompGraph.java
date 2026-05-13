package DSA.Graphs;

import java.util.ArrayList;

public class CompGraph {
    /*
        Component 1

        0 --- 1
        |     |
        |     |
        2 -----

        Component 2

        3 --- 4

        Component 3

        5 --- 6

    */

    public static ArrayList<Edge>[] createGraph(){
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
        // Component 1
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // Component 2
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));

        // Component 3
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));

        return graph;
    }
}