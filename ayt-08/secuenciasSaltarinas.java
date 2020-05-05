import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] arr = new int[n];
        boolean[] check = new boolean[n];
        for(int i = 0; i < n; ++i)// leer elementos del arreglo
            arr[i] = stdin.nextInt();
        for(int i = 1, a = 0; i < n; ++i) { 
            a = Math.abs(arr[i] - arr[i - 1]); // valor absoluto de la diferencia
            if(a < n && check[a] == false) check[a] = true; // setear tabla en true
        }
        for(int i = 1; i < n; ++i) {
            if (check[i] == false) {
                System.out.println("Not Jolly");
                break;
            }
            if(i == n - 1 && check[i] == true) {
                System.out.println("Jolly");
            }
        }
    }
}