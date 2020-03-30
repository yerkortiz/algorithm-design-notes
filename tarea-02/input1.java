import java.util.Stack; 
import java.util.Scanner;
/*
    Este programa lee todo el input del problema uno,
    lee la cantidad de cilindros en cada stack y lee
    la altura de cada cilindro en cada stack.
    Antes de implementar, es aconsejable que pruebe
    y experimente como funciona la edd stack.
*/
class problema1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(),
            n2 = input.nextInt(), 
            n3 = input.nextInt();
        Stack<Integer> stack1 = new Stack<Integer>(); 
        Stack<Integer> stack2 = new Stack<Integer>(); 
        Stack<Integer> stack3 = new Stack<Integer>(); 
        for(int i = 0; i < n1; ++i)
            stack1.push(input.nextInt());
        for(int i = 0; i < n2; ++i)
            stack2.push(input.nextInt());
        for(int i = 0; i < n3; ++i)
            stack3.push(input.nextInt());
        input.close();
        //for(int i = 0; i < n1; i++) 
        //    System.out.println(stack1.pop()); 
    }
}