class KMP_String_Matching { 
	static void KMPSearch(String pat, String txt, String rmp) { 
		int M = pat.length(); 
		int N = txt.length();
        //int count = 0;  
        int O = rmp.length();//largo del patrón de reemplazo
		int lps[] = new int[M]; 
        computeLPSArray(pat, M, lps);
		int j = 0;  
		int i = 0; 
        String T= "";
		while (i < N) { 
			if (pat.charAt(j) == txt.charAt(i)) { 
				j++; 
				i++; 
			} 
			if (j == M) { //cada vez que encontramos el patrón que nos piden buscar
                for(int w = i - j; w < (i - j) + O; ++w) {
                    //System.out.print(rmp.charAt(w - (i - j)));
                    T += rmp.charAt(w - (i - j));
                }
                //count++;
				j = lps[j - 1]; 
			} else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
				if (j != 0) {
                    j = lps[j - 1]; 
                } else{ //imprimir los que no pertenecen al patrón de búsqueda
                    //System.out.print(txt.charAt(i));
                    T += txt.charAt(i);
                    i++; 
                    }
			} 
		} 
        System.out.println(T);
        //System.out.println(count);
	} 

	static void computeLPSArray(String pat, int M, int lps[]) {  
		int len = 0; 
		int i = 1; 
		lps[0] = 0;
		while (i < M) { //mientras i sea menor que M
			if (pat.charAt(i) == pat.charAt(len)) { //si son iguales
				len++; 
				lps[i] = len; 
				i++; 
			} else { //si son distintos
				if (len != 0) { // si len no es cero
					len = lps[len - 1]; 
				} else { // si len es 0
					lps[i] = len; 
					i++; 
				} 
			} 
		} 
	} 
	public static void main(String args[]) { 
		String txt = "HOLAA"; 
		String pat = "AA"; 
        String rmp = "Z";
		KMPSearch(pat, txt, rmp); 
	} 
} 
