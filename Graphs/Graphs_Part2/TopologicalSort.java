package Graphs_Part2;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){ //True - cycle
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topologicalSort(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topSortUtil(graph, i, visited, s); //modified dfs
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean visited[], Stack<Integer> s){
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topSortUtil(graph, e.dest, visited, s);
            }    
        }

        s.push(curr);
    }

    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        topologicalSort(graph);
    }
}