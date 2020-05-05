import java.util.*;
import java.lang.*;
public class Main {
    static void search(int k, int N, int apples[], int S, int current_weight) {
        if (k == N) {
            if((Math.abs(S - 2*current_weight) < apples[N]))
                apples[N] = Math.abs(S - 2*current_weight);
            return;
        } else {
            current_weight += apples[k]; // agrego al saco el elemento en apples[k]
            search(k + 1, N, apples, S, current_weight);
            current_weight -= apples[k]; // no agrego al saco el elemento en apples[k]
            search(k + 1, N, apples, S, current_weight);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),
            S = 0; // donde guardaré la suma total de pesos del cajon inicial
        int[] apples = new int[N + 1]; // apples[N] guardo el mínimo
        for(int i = 0; i < N; ++i) {
            apples[i] = in.nextInt();
            S += apples[i];
        }
        apples[N] = 1 << 30;
        search(0, N, apples, S, 0);
        System.out.println(apples[N]);
    }
}