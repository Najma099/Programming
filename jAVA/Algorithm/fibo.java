import java.util.Scanner;
public class fibo{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int[][] a={{1,1},{1,0}};
        int[][] fiboo=pow(a,N);
        System.out.println(fiboo[1][0]);
    }
    public static int[][] pow(int[][] a,int N)
    {
        if(N==0)
        return new int[][] { { 1, 0 }, { 0, 1 } };
        if(N==1)
        return a;
        int[][] ans=pow(a,N/2);
        if(N%2==1)
        {
        int[][] temp=multiply(ans,ans);
        return multiply(temp,a);
        }
        else
        return multiply(ans,ans);
    }
    public static int[][] multiply(int[][] a,int[][] b)
    {
        int[][] result = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                int sum=0;
                for(int r=0;r<a[0].length;r++)
                {
                    sum+=a[i][r]*b[r][j];
                }
                result[i][j]=sum;
            }
        }
        return result;
    }
}