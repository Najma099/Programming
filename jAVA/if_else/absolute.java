import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>0)
        System.out.print("The absolute value is " +a);
        else
        a=a*(-1);
        System.out.print("The absolute value is " +a);
        sc.close();
    }
    
}
