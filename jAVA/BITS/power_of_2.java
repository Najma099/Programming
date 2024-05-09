//to check if any nuber is power of two
public class power_of_2 {
    public static void main(String[] args) {
        int n=18;
        if((n & (n-1))==0)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}
