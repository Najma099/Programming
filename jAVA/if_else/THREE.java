import java.util.Scanner;
public class THREE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of n:");
        int a= sc.nextInt();
        if(a>99 && a<1000)
        {
            System.out.print("The number is three digits");
        }
        else{
            System.out.print("The number is not three digits");
        }
        sc.close();

    }
    
}
