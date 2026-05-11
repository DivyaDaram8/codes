package DSA.Graphs;
import java.util.*;

public class DFS {
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited){
        visited[curr] = true;
        System.out.print(curr + " ");
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph, e.dest, visited);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = GraphCreate.createGraph();
        dfs(graph, 0, new boolean[graph.length]);
    }
}
