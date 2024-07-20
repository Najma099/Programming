package if_else;


import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the third number:");
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.print("sides of traingle");
        }
        else{
            System.out.print("not a side of triangle");
        }
        sc.close();

    }
    
}
