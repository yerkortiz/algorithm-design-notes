class KMP_String_Matching { 
	static void KMPSearch(String pat, String txt) { 
		int M = pat.length(); 
		int N = txt.length();  
		int lps[] = new int[M]; 
        computeLPSArray(pat, M, lps);
		int j = 0;  
		int i = 0; 
		while (i < N) { 
			if (pat.charAt(j) == txt.charAt(i)) { 
				j++; 
				i++; 
			} 
			if (j == M) { 
				System.out.println((i - j)); 
				j = lps[j - 1]; 
			} else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
				if (j != 0) j = lps[j - 1]; 
				else i++; 
			} 
		} 
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
        for(int w = 0; w < M; ++w)
            System.out.print(lps[w]+ " ");
        System.out.println();
	} 
	public static void main(String args[]) { 
		String txt = "H"; 
		String pat = "ABCABABC"; 
		KMPSearch(pat, txt); 
	} 
} 
