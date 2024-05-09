//number of set bit
public class number_of_set_bit {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        while(n>1)
        {
            if((n&1)==1)
            count++;
            n=n>>1;
        }
        if(n==1)
        count ++;
        System.out.println(count);
    }
}
