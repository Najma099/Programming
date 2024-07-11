public class stack {
    public static void main(String[] args) {
        int arr[]={12,8,41,37,2,49,19,28,21};
        // int crr[]= new int [arr.length];
        // for(int i=0;i<arr.length;i++)
        // {
        //     int max=0;
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(max<arr[j])
        //         {
        //             max=arr[j];
        //         }
        //     }
        //     crr[i]=max;
        // } 


        int crr[] = new int[arr.length];
        int ngt= arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            crr[i]=ngt;
            ngt=Math.max(ngt,arr[i]);
        }


        for(int ele:crr)
        {
            System.out.print(ele+" ");
        }
    }
}
