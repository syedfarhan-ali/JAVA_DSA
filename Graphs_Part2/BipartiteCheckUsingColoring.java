package Graphs_Part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteCheckUsingColoring {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){ //O(V+E)
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1; //no color
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { //BFS
                q.add(i);
                color[i] = 0; //yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1) {
                            int nextCol = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false; //not bipartite
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //If graph doesn't have cycles it is a bipartite graph by default
        /*
               0 ------ 2
              /         /
             /         /
            1         4
             \       /
              \     /
               \   /
                 3
                 False
        */
        int vertices = 5;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }        
}
