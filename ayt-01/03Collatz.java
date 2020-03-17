class Collatz 
{ 
    static void collatz(int n)
    {
        System.out.println(n);
        /* es n = 1? */
        if(n == 1) return;
        /* es n impar ?*/
        else if(n % 2 == 1) collatz(3 * n + 1);
        /* si no es impar implica que n es par */
        else collatz(n / 2);
    }
    static void collatz2(int n)
    {
        while(n > 1) {
            System.out.println(n);
            if(n % 2 == 0) n = n / 2;
            else n = (3 * n + 1);
        }
    }
    public static void main(String args[]) 
    { 
        collatz2(3);
    } 
} 