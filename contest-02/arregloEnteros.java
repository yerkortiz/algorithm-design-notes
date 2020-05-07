import java.util.*;
import java.lang.*;
public class Main {
	static int lilysHomework(int[] arr) {
        Integer[] idxs = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++)
            idxs[i] = i;
        Arrays.sort(idxs, (i1, i2) -> arr[i1] - arr[i2]); //ascendente
        int swaps1 = countSwaps(idxs);
        Arrays.sort(idxs, (i1, i2) -> arr[i2] - arr[i1]); //descendente
        int swaps2 = countSwaps(idxs);
        return swaps1 < swaps2 ? swaps1 : swaps2; //minimo de swaps
    }
    static int countSwaps(Integer[] idxs) {
        int swaps = 0;
        boolean[] visited = new boolean[idxs.length];
        for (int i = 0; i < idxs.length; i++) {
            if (visited[i]) continue;
            int j = i;
            do {
                visited[j] = true;
                j = idxs[j];
                swaps++;
            } while(j != i);
            swaps--;
        }
        return swaps;
    }
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = stdin.nextInt();
		int[] arr = new int[n],
			arrS = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = stdin.nextInt();
		int ans = lilysHomework(arr);
		System.out.println(ans);
	}	
}