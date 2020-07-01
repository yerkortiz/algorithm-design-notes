import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
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
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];
        int inf = ((1 << 30) | ((1 << 30) - 1));//valor maximo de int de 32 bits en complemento a 2
        Arrays.fill(distance, inf);
        PriorityQueue<Node> pq = new PriorityQueue<Node>(V, new Node());
        /* Incializar las variables */ 
        int source = 0; //origen
        /*algoritmo de dijkstra*/

        pq.add(new Node(source, 0));
        distance[source] = 0;

        while(!pq.isEmpty()) {
            int a = pq.peek().node; pq.poll();
            if(visited[a] == true) continue;
            visited[a] = true;
            for(int d = 0; d < V; ++d) {
                if(adj_mtrx[a][d] == 0) continue;
                int w = adj_mtrx[a][d];
                if(distance[a] + w < distance[d]) {
                    distance[d] = distance[a] + w;
                    pq.add(new Node(d, -distance[d]));
                }
            }
        }
        for(int d_: distance) System.out.print(d_ + " ");
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