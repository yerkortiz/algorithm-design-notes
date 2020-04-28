import java.util.*;
class oddcnt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int a, b, c;
        for(int i = 0; i < t; ++i) {
            a = input.nextInt();
            b = input.nextInt();
            if(a % 2 == 0 && b % 2 == 0) c = ((b - a)/2);
            else c = ((b - a)/2) + 1;
            System.out.println(c);
        }
    }
}