package loop;
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int a=2;
        for(int i=0;i<n;i++)
        {
            a=a*2;
            System.out.print(a +" ");
        }
        sc.close();

    }
    
}
