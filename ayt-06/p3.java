import java.util.*;
class GFG { 
	static String commonPrefixUtil(String str1, String str2) { 
		String result = ""; 
		int n1 = str1.length(), n2 = str2.length(); 
		for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) { 
			if (str1.charAt(i) != str2.charAt(j)) 
				break; 
			result += str1.charAt(i); 
		} 
		return (result); 
	} 
	/* d & c */
	static String commonPrefix(String arr[], int low, int high) { 
		if (low == high) 
			return (arr[low]); 
		if (high > low) { 
			int mid = low + (high - low) / 2; 
			String str1 = commonPrefix(arr, low, mid); 
			String str2 = commonPrefix(arr, mid + 1, high); 
			return (commonPrefixUtil(str1, str2)); 
		} 
		return null; 
	} 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
		String[] arr = new String[N];
        for(int i = 0; i < N; ++i)
            arr[i] = input.next();
		String ans = commonPrefix(arr, 0, N - 1); 
		if (ans.length() != 0) 
			System.out.println("The longest common prefix is " + ans); 
		else 
			System.out.println("There is no common prefix"); 
	} 
} 
