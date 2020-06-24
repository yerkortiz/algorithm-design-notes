import java.util.*;
public class Bipartito {
    public static boolean bipartito(boolean[][] mtrx, int source, int V) {
        int[] color = new int[V];//0->no tiene color aun, 1->tiene color1, 2->tiene color 2
        Arrays.fill(color, 0);
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(source);//encolo
        color[source] = 1;//asignar color
        while(cola.isEmpty() == false) { // mientras la cola no esté vacía
            int temp = cola.poll();//saco el primero de la cola
            for(int i = 0; i < V; ++i) { //encolo y marco como visitados, todos los nodos
                if(mtrx[temp][i] == true && color[i] == 0) {//si el hijo no tiene color asignado
                    cola.offer(i); // lo encolo
                    if(color[temp] == 1) color[i] = 2; // le asigno el color complementario al padre
                    else if(color[temp] == 2) color[i] = 1;
                } else if(mtrx[temp][i] == true && color[i] == color[temp]) //si el hijo tiene mismo color que el padre
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int V = stdin.nextInt(),
            E = stdin.nextInt();
        boolean[][] adj_mtrx = new boolean[V][V];
        for(int i = 0; i < E; ++i){
            int u = stdin.nextInt(),
                v = stdin.nextInt();
            adj_mtrx[u - 1][v - 1] = true;
            adj_mtrx[v - 1][u - 1] = true;
        }
        boolean bipartito = bipartito(adj_mtrx, 0, V);
        System.out.println(bipartito);
    }
}