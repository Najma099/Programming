
public class dutch_flag {
    public static void main(String[] args) {
        int arr[]={0,1,0,0,1,2,1,2,0,2};
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void swap(int arr[],int x,int y)
    {
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
