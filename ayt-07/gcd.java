import java.util.*;
class gcd
{ 
    static int gcd(int a, int b) { // euclides
      if(b == 0) return a;
      return gcd(b, a % b);
    }
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = input.nextInt();
        if(n == 1) 
            System.out.println(arr[0]);
        else {
            int gcd = gcd(arr[0], arr[1]);
            for(int i = 2; i < n; ++i)
                gcd = gcd(gcd, arr[i]);
            System.out.println(gcd);
        }
    } 
} 