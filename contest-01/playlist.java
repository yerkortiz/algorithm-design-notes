import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, j, ans = 0; 
        n = in.nextInt();
        int[] v = new int[n];
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for(i = 0, j = 0; i < n; ++i) {
            v[i] = in.nextInt();
            if(tree.contains(v[i]) == true){
                for(int k = j; k <= i; ++k){ // log n
                    if(v[k] == v[i]) { // actualizar segmento actual
                        j = k + 1;
                        break;
                    }
                    tree.remove(v[k]); // log n
                }
            } else tree.add(v[i]); // log n
            ans = Math.max(ans, tree.size());
        }
        System.out.println(ans);
    }
}
    