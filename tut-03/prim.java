import java.util.*;
public class Prim {
    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);
        int V = stdin.nextInt(), 
            E = stdin.nextInt();
        int[][] adj_mtrx = new int[V][V];//grafo con pesos
        for (int[] row: adj_mtrx) 
            Arrays.fill(row, 0);
        for(int i = 0; i < E; ++i) {//grafo no dirigido
            int u = stdin.nextInt(),
                v = stdin.nextInt(),
                w = stdin.nextInt();
            adj_mtrx[u - 1][v - 1] = w;
            adj_mtrx[v - 1][u - 1] = w;
        }
        //algoritmo de prim
        boolean[] visited = new boolean[V];
        PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());
        visited[0] = true;//marcar al primero como visitado
        for(int i = 0; i < V; ++i) {//recorrer hijos
            if(adj_mtrx[0][i] == 0) continue;//si no existe arista me salto a alguna que si exista
            int v = adj_mtrx[0][i];//peso del vertice de origen
            if(visited[i] == false) pq.add(new Node(i, v));//lo inserto en la cola de prioridad
        }
        int mst_cost = 0;
        while(!pq.isEmpty()) {//mientras la cola esté vacia
            Node front = pq.peek(); pq.poll();//saco al primero
            int u = front.node, w = front.cost;//guardo el vertice y el peso
            if(visited[u] == false) {
                mst_cost += w;
                visited[u] = true;
                for(int i = 0; i < V; ++i) {
                    if(adj_mtrx[u][i] == 0) continue;
                    int v = adj_mtrx[u][i];
                    if(visited[i] == false) pq.add(new Node(i, v));
                }
            }
        }
        System.out.println(mst_cost);
    }
}
public class Node implements Comparator<Node>{ 
    public int node, cost; 
    public Node(){} 
    public Node(int node, int cost) { 
        this.node = node;
        this.cost = cost; 
    } 
    public int compare(Node node1, Node node2) { 
        if (node1.cost < node2.cost) return -1; 
        if (node1.cost > node2.cost) return 1; 
        return 0; 
    } 
}