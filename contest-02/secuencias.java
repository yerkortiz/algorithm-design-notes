import java.util.*;
class secuencias {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
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