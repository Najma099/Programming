package if_else;


import java.util.Scanner;
public class conditions {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
               System.out.print(a+b);
               break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case'/':
                System.out.print(a/b);
                break;
    
        }
        sc.close();
    }
}
