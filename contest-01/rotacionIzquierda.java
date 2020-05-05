import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), //tamaño arreglo
            d = in.nextInt(); // rotaciones
        int[] arr = new int[n]; //arreglo
        for(int i = 0; i < n; ++i) 
            arr[i] = in.nextInt(); //llenar el arreglo
        for(int i = 0; i < n; ++i)
            System.out.print(arr[(i + d) % n] + " "); //imprimimos el arreglo rotado
    }
}