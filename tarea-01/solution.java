import java.util.Scanner;
class Tarea {
    static int tarea(int ps[], int dps[], int n)
    {
        int sum = 0;
        for(int i = 0; i < n; ++i)
            for(int j = i; j < n; ++j) 
                sum += (dps[j] * ps[i]);
        return sum;
    }
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dps = new int[n];
        int[] ps = new int[n];
        for(int i = 0; i < n; ++i)
            dps[i] = scanner.nextInt();
        for(int i = 0; i < n; ++i)
            ps[i] = scanner.nextInt();
        scanner.close();
        System.out.println(tarea(ps, dps, n));
    }
}