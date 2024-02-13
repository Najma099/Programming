import java.util.Scanner;
public class positiveintegers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a= sc.nextInt();
        if(a%5==0 || a%3==0)
        {
            System.out.print("The number is divisible by 5 or 3");
        }
        else{
            System.out.print("The number is not divisible by 5 or 3");
        }
        sc.close();

    }
    
}
