package DSA.Graphs;

import java.util.*;

public class HasPath {

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }
        visited[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest]  && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = GraphCreate.createGraph();
        if(hasPath(graph, 0, 5, new boolean[graph.length])){
            System.out.println("Path exists");
        } else {
            System.out.println("Path does not exist");
        }
    }
}
