import java.util.Scanner;
public class Analisis {
    public static int algoritmo1(int arr[], int n) 
    { 
        int cont = 0;
        for (int i = 0; i < n; i ++)
            for (int j = i, tmp = 0; j < n; j ++) { 
                tmp += arr[j];
                cont += tmp; 
            } 
        return cont; 
    }
    public static int algoritmo2( int arr[] , int n ) 
    { 
        int cont = 0; 
        for (int i=0; i<n; i++) 
            result += (arr[i] * (i+1) * (n-i)); 
        return result ; 
    }
    static boolean algoritmo3(int arr[], int n, int key)
    {
        int k = 0;
        for(int b = n/2; b >= 1; b /= 2)
            while(k + b < n &&  arr[k + b] <= key) k += b;
        if(arr[k] == key) return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
    }
}