package twoD_array;


public class largest{
    public static void main(String[] args) {
        int [][] arr={{5,6,7,8},{44,5,6,7}};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.print(max);
    }
}