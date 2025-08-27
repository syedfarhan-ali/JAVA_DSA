package Graphs_Part4;

import java.util.ArrayList;

public class BellmanFord {
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

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    static void createGraph2(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int vertices = graph.length;
        //O(V*E)
        //algo - O(V)
        for(int i=0; i<vertices - 1; i++){
            //edges - O(E)
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);

                    int u = e.src; //we don't actully have to make these
                    int v = e.dest; //but im doing it for clarity anyway
                    int wt = e.wt; //we can simply use e.src, e.dest and e.wt directly

                    //relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }

                }
            }
        }
        //print 
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void bellmanFord2(ArrayList<Edge> graph, int src, int vertices){
        int dist[] = new int[vertices];
        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        // O(V*E)
        for(int i=0; i<vertices - 1; i++){
            //edges - O(E)
            for(int j=0; j<graph.size(); j++){
                    Edge e = graph.get(j);

                    int u = e.src; //we don't actully have to make these
                    int v = e.dest; //but im doing it for clarity anyway
                    int wt = e.wt; //we can simply use e.src, e.dest and e.wt directly

                    //relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }

                }
        }
        //print 
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int vertices = 5;
        // ArrayList<Edge> graph[] = new ArrayList[vertices];
        // createGraph(graph);
        // bellmanFord(graph, 0);
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph2(graph);
        bellmanFord2(graph, 0, vertices);
    }
}