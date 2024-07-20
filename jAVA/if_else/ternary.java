package if_else;


import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println((n%2==0)? "Even":"odd");
        sc.close();
    }
    
}
