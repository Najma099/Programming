public class two_pointers {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        int n=arr.length;
        // reverse
        int i=0;
        int j=n-1;
        while(i<j)
        {
            Swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }


    }
    public static void Swap(int[] arr,int i,int j)
    {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}
