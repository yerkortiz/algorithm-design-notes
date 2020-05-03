import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Stack <Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); ++i) stack.push(str.charAt(i));
        while(!stack.isEmpty()) System.out.print(stack.pop());
    }
}