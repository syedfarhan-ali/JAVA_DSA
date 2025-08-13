package Graphs_Part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        //numcourses are nodes of graph && prerequisites are edges
        int indegree[] = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            graph.get(prerequisite).add(course);
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        //bfs
        int result[] = new int[numCourses];
        int index = 0;
        while (!q.isEmpty()) {
            int curr = q.remove();
            result[index] = curr;
            index++;

            for(int i=0; i<graph.get(curr).size(); i++){
                int neighbor = graph.get(curr).get(i);
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.add(neighbor);
                }
            }
        }
        return index == numCourses ? result : new int[0];
    }
}
