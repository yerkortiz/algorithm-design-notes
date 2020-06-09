import java.util.*;
class P1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt(),
            x = stdin.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = stdin.nextInt();
        stdin.close();
        Arrays.sort(arr);
        int cnt = 0;
        for(int i = 0, j = n - 1; j >= i; --j) {
            if(arr[j] + arr[i] <= x) { // van dos en la góndola
                    ++i;
                    ++cnt;
            } else ++cnt; // va solo en la góndola
        }
        System.out.println(cnt);
    }
}