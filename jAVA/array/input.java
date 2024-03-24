package array;


import java.util.Scanner;
public class input {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr= new int[7];
    for(int i=0;i<7;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<7;j++)
    {
        System.out.print(arr[j]+" ");
    }
    sc.close();
}
    
}
