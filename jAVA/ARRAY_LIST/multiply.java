package ARRAY_LIST;
public class multiply{
    public static void main(String[] args){
        int arr[][] ={{1,2},{3,4}};
        int brr[][]={{5,6},{7,8}};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        
            for(int j=0;j<brr[0].length;j++)
            {
                sum=0;
                for(int k=0;k<arr[0].length;k++)
                {
                    sum=sum+arr[i][k]*brr[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.print('\n');
        }
    }
}
