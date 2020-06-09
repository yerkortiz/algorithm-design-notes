import java.util.*;
class P2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt(),
            x = stdin.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) 
            arr[i] = stdin.nextInt();
        stdin.close();
    }
}