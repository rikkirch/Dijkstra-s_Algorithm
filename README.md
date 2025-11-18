# Classical Dijkstra’s Algorithm (Java Implementation)

## Author  
**Rikesh Budhathoki**  
CSC 492 – Independent Research  
Instructor: **Jun Huang**

---

## 📌 Overview

This project implements the **classical Dijkstra’s shortest-path algorithm** using:

- A **directed weighted graph** represented via adjacency lists  
- A **min-priority queue (binary heap)** to efficiently choose the next closest vertex  
- Full Java implementation with clean ADT structure (`Graph`, `Dijkstra`, `Main`)

The algorithm computes the **shortest distance from a single source node to all other nodes**, assuming **non-negative edge weights**.

This project is part of a research-based implementation comparing classical and improved versions of Dijkstra’s algorithm.

---

## 📘 What Dijkstra’s Algorithm Does

Dijkstra’s algorithm solves the **Single Source Shortest Path (SSSP)** problem.

Given:

- A graph \( G = (V, E) \)  
- Non-negative edge weights  
- A source vertex \( s \)

It computes:

\[
dist[v] = \text{minimum cost path from } s \text{ to } v
\]

---

## 🧠 How the Classical Algorithm Works

1. Initialize distances:  
   - `dist[source] = 0`  
   - All others = `∞`

2. Use a **min-priority queue** to repeatedly extract the vertex with the smallest known distance.

3. Relax all outgoing edges from that vertex:
   \[
   \text{if } dist[u] + w(u,v) < dist[v] \Rightarrow dist[v] = dist[u] + w(u,v)
   \]

4. Continue until all vertices are visited (finalized).

---

## ⏳ Time Complexity

| Method | Complexity |
|--------|-------------|
| Using Binary Heap | **O((V + E) log V)** |
| Using Array | **O(V²)** |

This implementation uses a **binary heap priority queue** → optimal for sparse graphs.

---

## 📂 Project Structure

```
src/
 └── dijkstra/
       └── classical/
            ├── Graph.java
            ├── Dijkstra.java
            └── Main.java
```

---

## ▶️ Running the Program (IntelliJ IDEA)

### 1. Clone the repository
```
git clone https://github.com/rikkirch/Dijkstra-s_Algorithm.git
```

### 2. Open in IntelliJ
- File → Open → Select project folder → OK

### 3. Run
Open:  
`src/dijkstra/classical/Main.java`  
Click **Run ▶**

---

## 📌 Sample Output
```
Shortest distances from node 0:
[0, 7, 3, 9, 5]
```

---

## 📚 References

- E. Dijkstra, *“A Note on Two Problems in Connexion with Graphs,”* Numerische Mathematik, 1959.  
- CLRS Textbook – *Introduction to Algorithms*, 3rd Edition.  
- https://en.wikipedia.org/wiki/Dijkstra%27s_algorithm  

---

## ✔️ Status
Completed classical implementation.  
Used as baseline for comparison with improved version.
