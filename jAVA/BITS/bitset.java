//to check if the kth bit is set or not
public class bitset {
    public static void main(String[] args) {
        int N=13;
        int k=2;
        if((N ^(1<<k))!=0)
        System.out.println("Set");
        else
        System.out.println("Not set");
    }
}
