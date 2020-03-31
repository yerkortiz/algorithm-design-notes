import java.util.Stack; 
import java.util.Scanner;
class problema2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Stack<Character> stack1 = new Stack<Character>();
        if(s.length() % 2 == 1) {
            System.out.println("NO\n");
            System.exit(0);
        }
        for(int i = 0; i < s.length() / 2; ++i)
            stack1.push(s.charAt(i));
        for(int i = s.length() / 2; i < s.length(); ++i){
            char k = stack1.pop();
            if(k == '{' && s.charAt(i) == '}') continue;
            else if(k == '(' && s.charAt(i) == ')') continue;
            else if(k == '[' && s.charAt(i) == ']') continue;
            else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    } 
}