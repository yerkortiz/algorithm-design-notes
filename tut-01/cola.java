import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<Integer>(); 
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        int N = 3;
        for(int i = 0; i < N; ++i)
            cola1.offer(i + 1);
        --N;
        for(int i = 0; i < N; ++i) {
            int temp = cola1.peek();
            cola1.poll();
            cola2.offer(temp);
        }
        System.out.println(cola1.peek());
        cola1.poll();
        --N;
        for(int i = 0; i < N; ++i) {
            int temp = cola2.peek();
            cola2.poll();
            cola1.offer(temp);
        }
        System.out.println(cola2.peek());
        cola2.poll();
        --N;
        for(int i = 0; i < N; ++i) {
            int temp = cola1.peek();
            cola1.poll();
            cola2.offer(temp);
        }
        System.out.println(cola1.peek());
        cola1.poll();
    }
}