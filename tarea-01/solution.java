import java.util.Scanner;
class tarea {
    public static void main 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();
    }
}