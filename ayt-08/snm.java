import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		int N = stdin.nextInt();
		int[] b  = new int[N];
		for(int i = 0; i < N; ++i)
			b[i] = stdin.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		stack.push(b[0]); // inserto en el stack el primero del arreglo
		for(int i = 1; i < N; i++) { 
			while(!stack.isEmpty() && stack.peek() < b[i]) // se encuentre el siguiente elemento mayor para todos los numeros en el stack
				map.put(stack.pop(), b[i]); // guardar en el mapa
			stack.push(b[i]);
		}
		while(!stack.isEmpty())
			if(!stack.isEmpty()) map.put(stack.pop(), -1);
		for(int i = 0; i < N; ++i)
			System.out.println(map.get(b[i]));
    }
}