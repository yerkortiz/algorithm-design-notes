import java.util.*;
public class Main { 
    static Set<String> tree_set = new TreeSet<>();
    static void Permutation(String str, String ans) { 
        if (str.length() == 0) { // encontramos una permutación
            tree_set.add(ans);
            return; 
        } 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            String aux = str.substring(0, i) + str.substring(i + 1); 
            Permutation(aux, ans + ch); 
        } 
    } 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        String s = in.next(); 
        Permutation(s, ""); 
        System.out.println(tree_set.size());
        tree_set.forEach((n) -> System.out.println(n)); 
    } 
}