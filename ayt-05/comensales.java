import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));
class problem2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrive = new int[n];
        int[] leave = new int[n];
        for(int i = 0; i < n; ++i) {
            arrive[i] = in.nextInt();
            leave[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arrive);
        Arrays.sort(leave);
        int max = 0, cont = 0;
        for(int i = 0, j = 0; i < n;) {
            if(arrive[i] < leave[j]){
                ++i; ++cont;
            } else if(arrive[i] > leave[j]) {
                ++j; --cont;
            } else {
                ++i; ++j;
            }
            if(cont >= max) max = cont;
        }
        System.out.println(max);
    }
}