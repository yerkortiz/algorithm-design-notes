/*
    Este código contiene un algoritmo que permite encontrar 
    los vertices de partida de un bosque de DAG
*/
import java.util.*;

public class SP {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int V = stdin.nextInt(), // cantidad de vertices
            E = stdin.nextInt(); // cantidad de aristas
        boolean[][] adj_mtrx = new boolean[V][V]; //boolean ya que es un grafo sin pesos
        for(int i = 0; i < E; ++i) {
            int u = stdin.nextInt(),
                v = stdin.nextInt();
            adj_mtrx[u - 1][v - 1] = true;
        }
        /*
        hasta aquí ya tenemos una matriz de adyacencia que representa el grafo
        recordar que el grafo que guardamos es un bosque de grafos dirigidos aciclicos
        recordar también que un DAG es un árbol, por eso el grafo es un bosque 
        */
        boolean[] visitados = new boolean[V]; //tabla de visitados
        Stack<Integer> pila = new Stack<Integer>();//dfs es a pila, como bfs es a cola
        HashSet<Integer> conjunto = new HashSet<Integer>();//una caja para almacenar los puntos de partida
        for(int s = 0; s < V; ++s){
            if(visitados[s] == true) continue;
            pila.push(s);
            visitados[s] = true;
            conjunto.add(s);
            while(!pila.isEmpty()){
                int aux = pila.pop();
                for(int d = 0; d < V; ++d){
                    if(adj_mtrx[aux][d] == false) continue;
                    if(visitados[d] == true){
                        conjunto.remove(d);
                        continue; 
                    } 
                    pila.push(d);
                    visitados[d] = true;
                    conjunto.remove(d);
                }
            }
        }
        Iterator<Integer> it = conjunto.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next() + 1);
    }
}
