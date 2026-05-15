package DSA.Graphs;

import java.util.*;

public class HasCycle {
    public static boolean hasCycle(ArrayList<Edge>[] graph, boolean[] visited) {
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (hasCycleUtil(graph, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par) {
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                if (hasCycleUtil(graph, visited, e.dest, curr)) {
                    return true;
                }
            } else if (visited[e.dest] && e.dest != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = GraphCreate.createGraph();
        boolean[] visited = new boolean[graph.length];
        System.out.println(hasCycle(graph, visited));
    }
}
