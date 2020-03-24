import java.util.Scanner;
class Main {
    static int solution(int arr[], int n)
    {
        if (n < 2) return 0;
        int cont = 0;
        for(int i = 1; i < n; ++i)
            if(arr[i] < arr[i - 1]) {
                cont += (arr[i - 1] - arr[i]);
                arr[i] += (arr[i - 1] - arr[i]);
            }
        return cont;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = in.nextInt();
        int s = solution(arr, n);
        System.out.println(s);
    }
}