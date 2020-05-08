import java.util.*;
class secuencias {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        /*
        // fuerza bruta
        int n = stdin.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; ++i)
            s[i] = stdin.nextInt();
        int m = stdin.nextInt();
        int[] q = new int[m];
        for(int j = 0; j < m; ++j)
            q[j] = stdin.nextInt();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(s[i] == q[j]) break;
                if(j == m - 1) System.out.print(s[i] + " ");
            }
        }
        */
        TreeSet<Integer> s = new TreeSet<Integer>(),
            q = new TreeSet<Integer>();
        int n = stdin.nextInt();
        for(int i = 0; i < n; ++i) 
            s.add(stdin.nextInt());
        int m = stdin.nextInt();
        for(int i = 0; i < m; ++i)
            q.add(stdin.nextInt());
        s.removeAll(q);
        s.forEach((x) -> System.out.print(x + " "));
    }
}