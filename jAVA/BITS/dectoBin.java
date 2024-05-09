//convert a number from decimal to binary
import java.util.Scanner;
public class dectoBin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder s= new StringBuilder("");
        while(n!=0)
        {
            if(n%2==1)
            s.append(1);
            else
            s.append(0);
            n=n/2;
        }
        s.reverse();
        System.out.println(s);
    }
}
