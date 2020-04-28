import java.util.*;
class media {
    public static void main(String[] args) {
        Scanner s_in = new Scanner(System.in);
        int n = s_in.nextInt(); // numero de elementos
        int[] arr = new int[n]; 
        for(int i = 0; i < n; ++i)
            arr[i] = s_in.nextInt(); //guardamos los elementos
        Arrays.sort(arr);
        System.out.println(arr[n / 2]);
    }
}