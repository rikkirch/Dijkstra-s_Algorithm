/********************************************************************
 *** NAME       : Rikesh Budhathoki                                ***
 *** CLASS      : CSC 492                                          ***
 *** ASSIGNMENT : Dijkstra's Algorithm (Classical Version)         ***
 *** DUE DATE   : TBD                                              ***
 *** INSTRUCTOR : Jun Huang                                        ***
 *********************************************************************
 *** DESCRIPTION : Implements the classical Dijkstra shortest-path
 ***               algorithm using a greedy strategy and a simple
 ***               array-based implementation. The algorithm
 ***               computes the minimum cost from a chosen source
 ***               vertex to every other vertex in a directed graph
 ***               with non-negative edge weights.                 ***
 ********************************************************************/


package dijkstra.classical;

import java.util.*;

public class Dijkstra {

    /****************************************************************
     *** METHOD shortestPath                                       ***
     *****************************************************************
     *** DESCRIPTION : Computes the shortest-path distances from a
     ***               single source vertex to all other vertices
     ***               in the given graph using the classical
     ***               Dijkstra algorithm. Complexity is O(V^2)
     ***               due to the linear scan used to select the
     ***               next vertex with minimum tentative distance. ***
     *** INPUT ARGS : Graph graph - directed weighted graph
     ***              int   source - source vertex index            ***
     *** OUTPUT ARGS: None                                          ***
     *** IN/OUT ARGS: None                                          ***
     *** RETURN     : int[] - array of shortest distances where
     ***                       result[v] is the cost of the
     ***                       shortest path from source to v.
     ***                       Integer.MAX_VALUE indicates that
     ***                       the vertex is unreachable.           ***
     ****************************************************************/
    public int[] shortestPath(Graph graph, int source) {
        int V = graph.getVertices();
        List<List<Graph.Node>> adj = graph.getAdjList();

        int[] dist = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = selectMin(dist, visited);
            visited[u] = true;

            for (Graph.Node neighbor : adj.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.weight;

                if (!visited[v] && dist[u] != Integer.MAX_VALUE &&
                        dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        return dist;
    }

    /****************************************************************
     *** METHOD selectMin                                          ***
     *****************************************************************
     *** DESCRIPTION : Helper method used by the Dijkstra algorithm
     ***               to select the unvisited vertex with the
     ***               smallest tentative distance value.           ***
     *** INPUT ARGS : int[] dist      - current distance estimates
     ***              boolean[] visited - visited flags for vertices***
     *** OUTPUT ARGS: None                                          ***
     *** IN/OUT ARGS: None                                          ***
     *** RETURN     : int - index of the vertex with minimum
     ***                    distance among unvisited vertices, or
     ***                    -1 if no such vertex exists.            ***
     ****************************************************************/
    private int selectMin(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
