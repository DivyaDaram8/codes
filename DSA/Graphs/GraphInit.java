package DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {
    int src;
    int dest;
    int weight;
    
    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

public class GraphInit {

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
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
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        /*
         * 
         * 1 --- 3
         * / | \
         * / | \
         * 0 | 5 --- 6
         * \ | /
         * \ | /
         * 2 --- 4
         * 
         */
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
        System.out.println();
        dfs(graph, 0, new boolean[v]);
    }
}
