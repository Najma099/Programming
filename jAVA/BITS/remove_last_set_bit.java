package BITS;


//remove the last set bit
public class remove_last_set_bit {
    public static void main(String[] args) {
        int n=6;
        int ans= n & n-1;
        System.out.print(ans);
    }
}
