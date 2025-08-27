package Graphs_Part4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsEdges {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt; //ascending order me compare karenge
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static void prims(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        ArrayList<Edge> mstEdges = new ArrayList<>();
        pq.add(new Edge(-1, 0, 0));
        int finalCost = 0; //MST cost or Total min weight

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            int destVertex = curr.dest;
            if (!visited[destVertex]) {
                visited[destVertex] = true;
                if(curr.src != -1){
                    mstEdges.add(curr);
                    finalCost += curr.wt;
                }

                for(int i=0; i<graph[destVertex].size(); i++){
                    Edge e = graph[destVertex].get(i);
                    if(!visited[e.dest])
                        pq.add(e);
                }
            }
        }
        //print the mst edges
        for(int i=0; i<mstEdges.size(); i++){
            Edge e = mstEdges.get(i);
            System.out.println("("+e.src+" , "+e.dest+" , "+e.wt+")");
        }
        System.out.println("Final minimum cost = "+finalCost);
    }

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        createGraph(graph);
        prims(graph);
    }
}
