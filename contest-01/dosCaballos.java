import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(), a, b;
        for (long i = 1; i <= n; i++) {
            a = i * i * (i * i - 1) / 2;
            b = 2 * (i - 2) * (2 * (i - 4) + 6);
            System.out.println(a - b);
        }
    }
}
