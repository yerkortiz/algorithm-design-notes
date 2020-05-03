import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt(),
            x, y;
        for(int i = 0; i < n; ++i) {
            x = in.nextInt(); y = in.nextInt();
            if(x >= y){
                if(x % 2 == 1) System.out.println((x - 1) * (x - 1) + y);
                else System.out.println(x * x - (y - 1));
            } else {
                if(y % 2 == 1) System.out.println(y * y - (x - 1));
                else System.out.println((y - 1) * (y - 1) + x);
            }
        }
    }
}
        