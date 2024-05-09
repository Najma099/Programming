//to check number of operartion is required to change a number from one to another
public class convert_num {
    public static void main(String[] args) {
        int a=10;
        int b=7;
        int c=a^b;
        int count=0;
        while(c!=0)
        {
            if((c & 1)==1)
            count++;
            c=c>>1;
        }
        System.out.print(count);
    }
}
