import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n, x, m = 0, s = 0; 
        n = in.nextLong();
        for(int i = 0; i < n; ++i) {
            x = in.nextLong();
            m = Math.max(m, x);
            s += x;
        }
        System.out.println(m > (s - m) ? 2 * m : s );
    }
}