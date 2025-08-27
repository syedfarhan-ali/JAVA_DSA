package Graphs_supplemental;

import java.util.ArrayList;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, int time, boolean[] visited, boolean[] ap){ // O(V+E)
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (par == neigh) {
                continue;
            } else if (visited[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else { // if neighbor is not visited
                dfs(graph, neigh, curr, dt, low, time, visited, ap);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
                children++;
            }
        }

        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void getArticulationPoint(ArrayList<Edge>[] graph, int vertices){
        int[] dt = new int[vertices];
        int[] low = new int[vertices];
        int time = 0;
        boolean[] visited = new boolean[vertices];
        boolean[] ap = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(graph, i, -1, dt, low, time, visited, ap);
            }
        }

        // print all APs
        for (int i = 0; i < vertices; i++) {
            if (ap[i]) {
                System.out.println("AP : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        createGraph(graph);
        getArticulationPoint(graph, vertices);
    }
}
