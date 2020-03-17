class Collatz 
{ 
    static void collatz(int n)
    {
        System.out.println(n);
        if(n == 1) return;
        else if(n % 2 == 1) collatz(3 * n + 1);
        else collatz(n / 2);
    }
    public static void main(String args[]) 
    { 
        collatz(3);
    } 
} 