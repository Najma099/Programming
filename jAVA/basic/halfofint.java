package jAVA.basic;
 import java.util.Scanner;
 public class halfofint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a= sc.nextInt();
        double y = (double)a;
        System.out.print("the half of integer:" +y/2);
        sc.close();

    }
    
}
