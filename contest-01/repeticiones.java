import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 1, max = 1;
        String str = in.next();
        for(int i = 1; i < str.length(); ++i) {
            if(str.charAt(i) == str.charAt(i - 1)) ++cnt;
            else cnt = 1;
            if(max < cnt) max = cnt;
        }
        System.out.println(max);
    }
}