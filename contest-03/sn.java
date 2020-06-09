import java.util.*;
import java.lang.*;
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; ++i) 
            s[i] = stdin.nextInt();
        int m = stdin.nextInt();
        int[] q = new int[m];
        for(int j = 0; j < m; ++j)
            q[j] = stdin.nextInt();
        stdin.close();
        for(int i = 0; i < Math.min(n, m); ++i)
            if(s[i] == q[i]) System.out.print((i + 1) + " ");
    }
}