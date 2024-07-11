public class sortt {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,2,0,0};
        int zero=0;
        int one=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            zero++;
            else if (arr[i]==1)
            one++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(j<zero)
            arr[j]=0;
            else if(j>=zero && j<zero+one)
            arr[j]=1;
            else
            arr[j]=2;
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}
