import java.util.*;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int u = in.nextInt(), v = in.nextInt(), // inicio
            x = in.nextInt(), y = in.nextInt(), // destino
            a, b, cnt = 0;
        boolean[][] mtrx = new boolean[8][8]; //tablero
        int[][] moves = {{2, 1}, {2, - 1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}}; // movimientos
        Queue<Integer> q = new LinkedList<>();
        q.add(u); q.add(v); q.add(cnt);
        while(!q.isEmpty()) {
            u = q.poll(); v = q.poll(); cnt = q.poll();
            mtrx[u][v] = true;
            if(u == x && v == y) break; // termina
            for(int i = 0; i < 8; ++i) { // encolar hijos
                a = u + moves[i][0]; b = v + moves[i][1];
                if (a >= 0 && a < 8 && b >= 0 && b < 8 && mtrx[a][b] == false) {
                    q.add(a); q.add(b); q.add(cnt + 1);
                }
            }
        }
        System.out.println(cnt);
    }
}