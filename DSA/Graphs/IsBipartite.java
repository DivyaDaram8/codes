package DSA.Graphs;
import java.util.*;

public class IsBipartite {
    public static boolean isBipartite(ArrayList<Edge>[] graph, int[] color, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                int nextColor = color[curr] == 0 ? 1 : 0;
                if(color[e.dest] == -1){
                    color[e.dest] = nextColor;
                    q.add(e.dest);
                }else if(color[e.dest] == color[curr]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = GraphCreate.createGraph();
        int[] color = new int[graph.length];
        for(int i = 0; i < graph.length; i++){
            color[i] = -1;
        }
        boolean bipartite = true;
        for(int i = 0; i < graph.length; i++){
            if(color[i] == -1){
                if(!isBipartite(graph, color, i)){
                    bipartite = false;
                    break;
                }
            }
        }
        if(bipartite){
            System.out.println("The graph is bipartite.");
        }else{
            System.out.println("The graph is not bipartite.");
        }
    }
}
