import java.util.*;

public class Graph {
    int V; // numero de vertices
    LinkedList<Integer> adj[]; // lista adjunta del vertice v
    Graph(int v) {
        V = v; // el grafo tendrá v
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) // lista de listas
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) { // agregar aristas
        adj[v].add(w);
        adj[w].add(v);
    }
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[]) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(4, 5);
        g.BFS(0);
    }
}