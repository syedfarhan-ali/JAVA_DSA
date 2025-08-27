package Graphs_supplemental;

import java.util.ArrayList;

public class Tarjans_algo {
    // we will make two arrays
    // dt[] = new int[vertices] // Discovery time of node
    // low[] = new int[vertices] // lowest discovery time of all neighbors
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
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
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int[] dt, int[] low, boolean[] visited, int time){
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (neigh == par) {
                continue;
            } else if(!visited[neigh]){
                dfs(graph, neigh, curr, dt, low, visited, time);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge : "+ curr + " --- " + neigh);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void tarjansBridge(ArrayList<Edge>[] graph, int vertices){
        int[] dt = new int[vertices];
        int[] low = new int[vertices];

        int time = 0;
        boolean[] visited = new boolean[vertices];

        for(int i=0; i<graph.length; i++){
            if (!visited[i]) {
                dfs(graph, i, -1, dt, low, visited, time);
            }
        }
    }

    public static void main(String[] args){
        int vertices = 5;

        ArrayList<Edge>[] graph = new ArrayList[vertices];
        createGraph(graph);
        tarjansBridge(graph, vertices);
    }
}
