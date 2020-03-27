class Collatz {
    static void collatz(int n)
    {
        System.out.println(n);
        if(n == 1) return;
        else if((n & 1) == 1) collatz(((n << 1)|1) + n);
        else collatz(n >> 1);
    }
    public static void main(String[] args)
    {
        collatz(3);
    }
}