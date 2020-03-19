/* Ejemplo sobre lectura de input usando el stdin */
/* 
    El programa lee un entero N que indica el largo de
    un arreglo y posteriormente lee un arreglo de largo N.
    la funcion sum, suma todos los elementos del arreglo
    y luego imprime el resultado de la suma en el main.
 */
import java.util.Scanner; 
class Sum
{ 
    static int Sum(int n, int arr[])
    {
        int sum = 0;
        for(int i = 0; i < n; ++i)
            sum += arr[i];
        return sum;
    }
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();
        scanner.close();
        int s = Sum(n, arr);
        System.out.println(s); 
    } 
}
