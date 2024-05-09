//count the number of set bit
public class set_bit_count {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        while(n!=0)
        {
            n=n&n-1;
            count++;
        }
        System.out.print(count);
    }
}
