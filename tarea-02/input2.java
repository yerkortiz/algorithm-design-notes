import java.util.Queue; 
import java.util.Scanner;
import java.util.LinkedList; 
/*
    Este programa lee la entrada del problema 2,
    al igual que el programa anterior, es recomendable
    que experimente con la edd queue antes de implementar
    su solución.
*/
class problema2 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr = new int[9];
        int max = 0;
        Queue<Integer> queue = new LinkedList<>(); 
        for(int i = 0; i < n; ++i) {
            int k = input.nextInt() - 1;
            if(k > max) max = k;
            ++arr[k];
            queue.add(k);
        }
        input.close();
        int x, cnt = 0, j = 0;
        while(! queue.isEmpty()){
            x = queue.remove();
            ++cnt;
            if(x == max) {
                --arr[max];
                if(arr[max] == 0) 
                    for(int i = 8; i >= 0; --i) 
                        if(arr[i] > 0) max = i;
            } else {
                queue.add(x);
                if(j == m) 
            }
            ++j;
        }
    } 
} 