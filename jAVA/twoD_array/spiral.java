

public class spiral {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te=arr.length*arr[0].length;
        int count=0;
        while(minr<=maxr && minc<=maxc)
        {
            //first row
            for(int i=minc;i<=maxc && count<te;i++)
            {
                System.out.print(arr[minr][i]+" ");
                count++;
                if(count%3==0)
                {
                System.out.print("\n");
                }
            }
            
            minr++;
            for(int j=minr;j<=maxr && count<te;j++)
            {
                System.out.print(arr[j][maxc]+" ");
                count++;
                if(count%3==0)
                {
                System.out.print("\n");
                }
            }
           // System.out.print("\n");
            maxc--;
            for(int k=maxc;k>=minc && count<te;k--)
            {
                System.out.print(arr[maxr][k]+" ");
                count++;
                if(count%3==0)
                {
                System.out.print("\n");
                }
            }
            //System.out.print("\n");
            maxr--;
            for(int m=maxr;m>=minr && count<te;m--)
            {
                System.out.print(arr[m][minc]+" ");
                count++;
                if(count%3==0)
                {
                System.out.print("\n");
                }
            }
           // System.out.print("\n");
            minc++;
        }
    }
}
