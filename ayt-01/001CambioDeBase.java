/* 
    Author: Yerko Ortiz
    Código para transformar un número natural 
    de base 10, en un número natural de base k.
*/
//import java.util.Scanner;
public class PROGRAM {
    static void solution(int n, int k) 
    { 
        if (n > 1) solution(n / k, k); 
        System.out.print(n % k + " ");
    } 
    public static void main(String args[]) 
    { 
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt(), k = in.nextInt();
        int n, k;
        if(args.length != 2) System.exit(0); 
        n = Integer.parseInt(args[0]);
        k = Integer.parseInt(args[1]);
        solution(n, k);
        System.out.println();
    }
}
