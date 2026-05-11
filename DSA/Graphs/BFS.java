package DSA.Graphs;
import java.util.*;
import DSA.Graphs.GraphCreate;
import DSA.Graphs.Edge;

public class BFS {
    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited[curr]){
                visited[curr] = true;
                System.out.print(curr + " ");
                for(int i  = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = GraphCreate.createGraph();
        bfs(graph);
    }
}
