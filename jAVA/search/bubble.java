package search;


import java.util.Scanner;

public class bubble {
    public static int[] bubbleSort(int[] arr){
        int N=arr.length;
        for(int i=0;i<N-1;i++){
            boolean flag=false;
            for(int j=0;j<N-1-i;j++){
                if(arr[j+1]<arr[j])
                {
                    flag=true;
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            if(!flag)
            break;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ans=bubbleSort(arr);
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
        sc.close();
    }
}
