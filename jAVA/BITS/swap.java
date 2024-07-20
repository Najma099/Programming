package BITS;


public class swap {
    public static void main(String[] args)
    {
        int a=7;
        int b=6;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
    }
}
