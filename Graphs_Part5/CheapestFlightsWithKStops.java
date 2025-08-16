package Graphs_Part5;

import java.util.ArrayList;

public class CheapestFlightsWithKStops {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int[][] flights, ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 100));

        graph[1].add(new Edge(1, 2, 100));
        graph[1].add(new Edge(1, 3, 600));

        graph[2].add(new Edge(2, 0, 100));
        graph[2].add(new Edge(2, 3, 200));
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dest = 3, k = 1;

        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);
    }
}
