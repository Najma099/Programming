package if_else;


import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter marks:");
        int n= Sc.nextInt();
        if(n>80 && n<=100)
        System.out.print("very good");
        else if(n>60)
        System.out.print("Good");
        else if (n>40)
        System.out.print("Average");
        else
        System.out.print("fail");
        Sc.close();
        }
}
