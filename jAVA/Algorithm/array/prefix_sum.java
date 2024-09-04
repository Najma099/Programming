

import java.util.Scanner;
public class prefix_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] arr= new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int j=1;j<6;j++)
        {
            arr[j]=arr[j-1]+arr[j];
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}