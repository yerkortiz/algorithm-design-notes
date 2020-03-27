class GrayCodes {
    static void position(int k)
    {
        int c = 0;
	    for(int i = 0; i < 32; ++i)
		    if((k & (1 << i)) > 0) {
			    c ^= ((1 << i) - 1);
			    c |= (1 << i);
		    }
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        position(7);
    }
}