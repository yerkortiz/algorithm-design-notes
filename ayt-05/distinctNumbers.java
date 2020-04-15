import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class problem1 {
    //O(n lg n)
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int[] array = new int[n];
        for(int i = 0; i < n; ++i)
            array[i] = in.nextInt();
        in.close();
        Arrays.sort(array); // 1, 3, 2, 5, 4 -> 1, 2, 3, 4, 5
        // O(n lg n)
        //Arrays.sort(arr, Collections.reverseOrder());
        int cont = 1;
        for(int i = 1; i < n; ++i) // O(n)
            if(array[i] != array[i - 1]) ++cont;
        System.out.println(cont);
    }
}