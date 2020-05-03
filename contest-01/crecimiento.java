import java.util.*;
import java.lang.Math;
public class Main {
    static void solucion1() {
        Scanner in = new Scanner(System.in);
        int cnt, T_0, M_0;
        for ( M_0 = in.nextInt(), 
            T_0 = in.nextInt(), 
            cnt = 0; 
            T_0 >= M_0; 
            T_0 *= 2, M_0 *= 3, ++cnt );
        System.out.println(cnt);
    }
    static void solucion2() {
        Scanner in = new Scanner(System.in);
        int T_0 = in.nextInt(), 
            M_0 = in.nextInt(),
            cnt = (int) Math.ceil(Math.log((double) M_0 / (double) T_0) / 
                Math.log(2.0 / 3.0) - 1);
        System.out.println(Math.abs(cnt));
    }
    public static void main(String[] args) {
        solucion1();
    }
}