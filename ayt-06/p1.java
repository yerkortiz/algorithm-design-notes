/* Diccionario */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.io.PrintWriter;
public class main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SortedSet<String> st = new TreeSet<String>();
		Pattern p = Pattern.compile("[a-z]+");
		String str;
		StringBuilder strB = new StringBuilder();
		while(scan.hasNextLine()) {
			str = scan.nextLine();
			strB.append(" " +str.toLowerCase());
		}
		String ans = strB.toString();
		Matcher m = p.matcher(ans);
		while(m.find())
			st.add(m.group());
		for(String i : st) 
			System.out.println(i);
	}
}