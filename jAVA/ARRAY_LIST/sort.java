package ARRAY_LIST;
public class sort{
    public static void main(String[] args){
        int[] arr={1,0,1,1,0,1,0,0,1};
        int noOfZero=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            noOfZero ++; 
        }
        for(int i=0;i<n;i++)
        {
            if(i<noOfZero) arr[i]=0;
            else
            arr[i]=1;
        }
       
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}