package ARRAY_LIST;

public class sort1 {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,0,0,1,0,1,0};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]==1 && arr[j]==0)
            swap(arr,i ,j);
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr ,int i,int j) {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
}
