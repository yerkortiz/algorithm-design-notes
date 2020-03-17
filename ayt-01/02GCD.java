class gcd
{ 
    static int gcd(int a, int b)
    {
      System.out.println(a + " " + b);
      if(b == 0) return a;
      return gcd(b, a % b);
    }
    public static void main(String args[]) 
    { 
        gcd(16, 8);
    } 
} 