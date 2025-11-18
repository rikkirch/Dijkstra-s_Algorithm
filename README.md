# Classical Dijkstra's Algorithm (Java)

**Author:** Rikesh Budhathoki  
**Course:** CSC 492  
**Instructor:** Jun Huang  

This project implements the **classical, array-based Dijkstra’s Algorithm** for solving the Single Source Shortest Path (SSSP) problem on directed graphs with **non-negative** edge weights.  
The structure includes clear header comments and a modular design matching common academic requirements.

## 1. Overview

Dijkstra's Algorithm computes the shortest path from a single source vertex to all other vertices in a weighted graph **with no negative edges**.

This version uses:

- An adjacency list representation of the graph  
- Linear scanning to find the next vertex with minimum distance  
- Arrays to store:
  - `dist[v]` shortest known distance from source
  - `visited[v]` to mark finalized vertices

## 2. Time & Space Complexity

| Version | Data Structure | Complexity |
|--------|----------------|------------|
| Classical Dijkstra | Array + linear scan | **O(V²)** |
| Improved version (different repo) | Priority Queue | **O((V+E) log V)** |

Space complexity: **O(V + E)**

## 3. Project Structure

```
src/
  dijkstra/
    classical/
      Main.java
      Graph.java
      Dijkstra.java
```

## 4. How to Clone

```bash
git clone https://github.com/rikkirch/Dijkstra-s_Algorithm.git
cd Dijkstra-s_Algorithm
```

## 5. Run in IntelliJ

Open project → Run `Main.java`.

Expected output:

```
Shortest distances from node 0:
[0, 7, 3, 9, 5]
```

## 6. Modify Graph

Edit edge list in `Main.java`.

## 7. Assumptions

- No negative weights  
- Directed graph  
