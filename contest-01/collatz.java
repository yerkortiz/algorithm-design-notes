import java.util.*;
public class Main {
    static void collatz(long n) {
        System.out.print(n + " ");
        if(n == 1) return;
        else if((n & 1) == 1) collatz(((n << 1)|1) + n);
        else collatz(n >> 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        collatz(n);
    }
}