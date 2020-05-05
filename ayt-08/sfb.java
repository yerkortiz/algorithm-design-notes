import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; ++i) 
            arr[i] = stdin.nextInt();
        int[] sol = new int[n];
        Arrays.fill(sol, -1);
        // O(n^2)
        for(int i = 0; i < n; ++i)
            for(int j = i; j < n; ++j) 
                if(arr[j] > arr[i]){
                    sol[i] = arr[j];
                    break;
                }
        for(int i = 0; i < n; ++i)
            System.out.println(sol[i]);
    }
}