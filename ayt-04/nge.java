import java.util.Stack;
import java.util.Scanner;
public class NGE { 
    static void printNGE(int arr[], int n)  
    {  
        int element;
        Stack<Integer> s = new Stack<Integer>(); 
        s.push(arr[0]); 
        for (int i = 1; i < n; i++)  { 
            if (!s.isEmpty()) { 
                element = s.pop(); 
                while (element < arr[i]) { 
                    System.out.println(element + " NGE is " + arr[i]); 
                    if (s.isEmpty()) break; 
                    element = s.pop(); 
                } 
                if (element > arr[i]) s.push(element); 
            } 
            s.push(arr[i]); 
        } 
        while (!s.isEmpty())
            System.out.println(s.pop() + " NGE is: -1"); 
    } 
  
    public static void main(String[] args)  
    { 
        int arr[] = { 11, 13, 21, 3 }; 
        int n = arr.length; 
        printNGE(arr, n); 
    } 
} 