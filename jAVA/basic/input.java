package basic;


import java.util.Scanner;
class input 
{
     public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number:");
     int n= sc.nextInt();
     System.out.println(n*n);
     sc.close();
    }
}
