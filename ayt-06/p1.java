/* Diccionario */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.io.PrintWriter;
public class main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SortedSet<String> st = new TreeSet<String>(); //árbol
		Pattern p = Pattern.compile("[a-z]+"); // solo deja las letras minusculas
		String str;
		StringBuilder strB = new StringBuilder();
		while(scan.hasNextLine()) {
			str = scan.nextLine();
			strB.append(" " +str.toLowerCase()); // pasar letras del text a minusculas
		}
		String ans = strB.toString();
		Matcher m = p.matcher(ans); // dejar el texto en minusculas y sin signos de puntuación
		while(m.find())
			st.add(m.group());
		for(String i : st) 
			System.out.println(i);
	}
}