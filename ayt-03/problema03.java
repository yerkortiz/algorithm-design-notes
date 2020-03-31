import java.util.Stack; 
import java.util.Scanner;
class problema3 {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stackAux = new Stack<Integer>(); 
        Stack<Integer> colaPila = new Stack<Integer>(); 
        int N = in.nextInt();
        for(int i = 0; i < N; ++i)
            stackAux.push(in.nextInt());
        for(int i = 0; i < N; ++i)
            colaPila.push(stackAux.pop());
        for(int i = 0; i < N; ++i)
            System.out.println(colaPila.pop());
    }
}