import java.util.Scanner;

public class binaraytodecimal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String s = sc.next();
        int p2=1;
        int sum = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            sum+=p2;
            p2=p2*2;
        }
        System.out.println("Decimal equivalent: " + sum);
    }
}
