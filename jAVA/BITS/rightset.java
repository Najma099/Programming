package BITS;


public class rightset {
    //if bit is set or not using right shift
    public static void main(String[] args) {
        int n=13;
        int k=2;
        if(((n>>k)&1)==1)
        System.out.print("Set");
        else
        System.out.print("Not set");
    }
}
