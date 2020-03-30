import java.util.Queue; 
import java.util.Scanner;
import java.util.LinkedList; 
/*
    Este programa lee la entrada del problema 2,
    al igual que el programa anterior, es recomendable
    que experimente con la edd queue antes de implementar
    su solución.
*/
public class problema2 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        Queue<Integer> queue = new LinkedList<>(); 
        for(int i = 0; i < n; ++i)
            queue.add(input.nextInt());
        input.close();
        //for(int i = 0; i < n; ++i)
        //    System.out.println(queue.remove());
    } 
} 