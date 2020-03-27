class printDecToBin
{ 
    static void printDecToBin(int n)
    {
        if (n > 1) bin(n >> 1);
        System.out.print(n & 1);
    }
    public static void main(String args[]) 
    { /* 100 */
        bin(4);
    } 
} 