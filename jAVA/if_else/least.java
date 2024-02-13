import java.util.Scanner;
public class least {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        System.out.println("Enter second number:");
        System.out.println("Enter third number:");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c= Sc.nextInt();
        if(a<b)
        {
            if(a<c)
            System.out.print(a+"is the smallest");
            else
            System.out.print(c+ "is the smallest");

        }
        else 
        {
            if(b<c)
            System.out.print(b+"is the smallest");
            else
            System.out.print(c+ "is the smallest");

        }
       
        

        Sc.close();
    }
    }
    

