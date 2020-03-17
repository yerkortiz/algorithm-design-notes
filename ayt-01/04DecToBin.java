class decToBin
{ 
    static void bin(int n)
    {
        if (n > 1) bin(n / 2);
        System.out.println(n % 2);
    }
    public static void main(String args[]) 
    { 
        bin(4);
    } 
} 