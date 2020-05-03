import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),
            cnt = 1;
        int[] arr = new int[N];
        for(int i = 0; i < N; ++i) 
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        for(int i = 1; i < N; ++i)
            if(arr[i] != arr[i - 1]) ++cnt;
        System.out.println(cnt);
    }
}