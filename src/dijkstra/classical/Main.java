/********************************************************************
 *** NAME       : Rikesh Budhathoki                                ***
 *** CLASS      : CSC 492                                          ***
 *** ASSIGNMENT : Dijkstra's Algorithm (Classical Version)         ***
 *** DUE DATE   : TBD                                              ***
 *** INSTRUCTOR : Jun Huang                                        ***
 *********************************************************************
 *** DESCRIPTION : Entry point for testing the classical Dijkstra's
 ***               shortest path algorithm implementation in Java.
 ***               Builds a sample directed weighted graph, runs the
 ***               algorithm from a chosen source vertex, and prints
 ***               the resulting shortest path distances.           ***
 ********************************************************************/

package dijkstra.classical;

import java.util.Arrays;

public class Main {

    /****************************************************************
     *** METHOD main                                               ***
     *****************************************************************
     *** DESCRIPTION : Driver method. Constructs a test graph with
     ***               5 vertices and several directed edges with
     ***               positive weights, then invokes the classical
     ***               Dijkstra algorithm starting from vertex 0 and
     ***               prints the shortest-path distance array.     ***
     *** INPUT ARGS : String[] args  - command-line arguments       ***
     *** OUTPUT ARGS: None                                          ***
     *** IN/OUT ARGS: None                                          ***
     *** RETURN     : void                                          ***
     ****************************************************************/
    public static void main(String[] args) {

        // Create a graph with 5 vertices (0 through 4)
        Graph graph = new Graph(5);

        // Add directed edges: u -> v with weight w (non-negative)
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 1, 4);
        graph.addEdge(2, 3, 8);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 4, 7);
        graph.addEdge(4, 3, 9);

        // Create an instance of the Dijkstra algorithm
        Dijkstra dijkstra = new Dijkstra();

        // Compute shortest paths from source vertex 0
        int sourceVertex = 0;
        int[] distances = dijkstra.shortestPath(graph, sourceVertex);

        // Display results
        System.out.println("Shortest distances from node " + sourceVertex + ":");
        System.out.println(Arrays.toString(distances));
    }
}
