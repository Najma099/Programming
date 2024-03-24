package array;


import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the element of array:");
        int[] arr = new int[n];
        int temp=arr[0];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();  
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]>temp)
            {
                temp=arr[j];
            }

        }
        System.out.print("the maximum element:"+temp);
        sc.close();
    }
}
