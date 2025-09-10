//Find the Shortest Path length in an Unweighted Graph

package DPC;
import java.util.*;
public class Day27 {
    static int shortestPathLength(List<List<Integer>> graph, int src, int dest, int n) {
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];       
        Arrays.fill(distance, -1); // initialize with -1 (unreachable)        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited[src] = true;
        distance[src] = 0;       
        while (!queue.isEmpty()) {
            int node = queue.poll();           
            if (node == dest) return distance[node]; // shortest path found          
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }       
        return -1; // if destination is not reachable
    }    
    public static void main(String[] args) {
        int n = 6; // number of nodes (0 to 5)
        List<List<Integer>> graph = new ArrayList<>();       
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());       
        // Add edges (undirected)
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(3).add(4);
        graph.get(4).add(5);        
        int src = 0, dest = 5;
        int result = shortestPathLength(graph, src, dest, n);        
        System.out.println("Shortest path length from " + src + " to " + dest + " is: " + result);
    }
}

OUTPUT:-
Shortest path length from 0 to 5 is: 4
