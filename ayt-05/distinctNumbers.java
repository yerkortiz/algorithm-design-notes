import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class problem1 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; ++i)
            array[i] = in.nextInt();
        in.close();
        Arrays.sort(array);
        //Arrays.sort(arr, Collections.reverseOrder());
        int cont = 1;
        for(int i = 1; i < n; ++i)
            if(array[i] != array[i - 1]) ++cont;
        System.out.println(cont);
    }
}