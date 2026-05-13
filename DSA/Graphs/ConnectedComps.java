package DSA.Graphs;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class ConnectedComps {
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
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
        ArrayList<Edge>[] graph = CompGraph.createGraph();
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                // bfs(graph, visited, i);
                dfs(graph,i, visited);
                System.out.println();
            }
        }
    }
}
