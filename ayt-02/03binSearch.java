class BinarySearch { 
    /* implementación clasica */
    static boolean binarySearch1(int arr[], int lo, int hi, int key) 
    { 
        if (hi >= lo) { 
            int mid = lo + (hi - lo) / 2; 
            if (arr[mid] == key) 
                return true; 
            if (arr[mid] > key) //irse a la izquierda
                return binarySearch1(arr, lo, mid - 1, key); 
            return binarySearch1(arr, mid + 1, hi, key); // irse a la derecha
        } 
        return false; 
    } 
    /* implementación iterativa */
    static boolean binarySearch2(int arr[], int n, int key)
    {
        int k = 0;
        for(int b = n/2; b >= 1; b /= 2)
            while(k + b < n &&  arr[k + b] <= key) k += b;
        if(arr[k] == key) return true;
        return false;
    }
    public static void main(String args[]) 
    {  
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        //boolean result1 = binarySearch1(arr, 0, n - 1, 2); 
        boolean result2 = binarySearch2(arr, n, 40);
        System.out.println(result2);
    } 
} 