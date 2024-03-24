package array;


public class Secondmax {
    public static void main(String[] args) {
        int[] arr={23,45,65,66,78,87};
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           mx=Math.max(mx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            if(arr[j]!= mx)
            smx= Math.max(smx,arr[j]);
        }
        System.out.println("THe maximum value of array:"+mx);
        System.out.println("The second maximum value of array:"+smx);
    }
   
}
