import java.util.Scanner;
public class UF {
    private int[] id; 
    private int count; 
    public UF(int N) { 
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        }
    public int count()
    { return count; }
    public boolean connected(int p, int q)
    {   return find(p) == find(q);  }
    public int find(int p)
    {
        while (p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q)
    { 
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        id[i] = j;
        count--;
    }
    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); 
        UF uf = new UF(N);
        int K = 2;
        while (K > 0)
        {
            int p = input.nextInt();
            int q = input.nextInt(); 
            if (q <= p) break;
            if (uf.connected(p, q)) continue; 
            uf.union(p, q); 
            System.out.println(p + " " + q); 
            --K;
        }
        input.close();
        System.out.println(uf.count() + " components");
    }
}