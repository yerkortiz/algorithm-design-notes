class decToBin
{ 
    static void bin(int n)
    {
        if (n > 1) bin(n / 2);
        System.out.print(n % 2);
    }
    static void bin2(int n)
    {
        while(n > 0) {
            System.out.print(n % 2);
            n = n / 2;
        }
    }
    public static void main(String args[]) 
    { /* 100 */
        bin(4);
        System.out.println();
        bin2(4);
    } 
} 