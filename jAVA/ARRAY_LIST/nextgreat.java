package ARRAY_LIST;


import java.util.Scanner;
public class nextgreat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            int input= sc.nextInt();
            arr[i]=input;
        }
        int maxindex=0;
        int maxNo=arr[0];
        for(int j=0;j<n;j++)
        {
            if(arr[j]>maxNo)
            {
                maxNo=arr[j];
                maxindex=j;
            }
        }
        int SecondMax=0;
        int k=0;
        while(k<n && k!=maxindex)
        {
            if(arr[k]>SecondMax)
            {
                SecondMax=arr[k];
            }
            k++;
        }
        System.out.println(maxNo);
        System.out.println(SecondMax);
        sc.close();

    }
}
