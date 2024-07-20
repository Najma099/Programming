package BITS;


public class ith_bit_clear {
    public static void main(String[] args) {
        int n=9;
        int i=3;
        System.out.print(n & ~ (1<<i));
        //System.out.print(n^(1<<i));
    }
}
