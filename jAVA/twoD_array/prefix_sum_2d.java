//import java.util.Scanner;
public class prefix_sum_2d {
    //Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
       
        int[][] a={{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        //prefix sum row
        for(int i=0;i<7;i++)
        {
            for(int j=1;j<7;j++)
            {
                a[i][j]=a[i][j-1]+a[i][j];
            }
        }
        //printing the row prefix sum
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //column wise prefix sum of the row prefix sum
        for(int j=0;j<7;j++)
        {
            for(int i=1;i<7;i++)
            {
                a[i][j]=a[i-1][j]+a[i][j];
            }
        }
        //printing column wise prefix sum of the row prefix sum
        for(int j=0;j<7;j++)
        {
            for(int i=0;i<7;i++)
            {
                System.out.print(a[j][i] +" ");
            }
            System.out.println();
        }
        //take input of the reactagular gradient
        int r1=3;
        int c1=3;
        int r2=5;
        int c2=5;

        // calculating the sum
        int sum=0;
        sum=a[r2][c2]-a[r2-r1][c2]-a[r2][c2-c1]+a[r2-r1][c2-c1];
        System.out.print(sum);
    }
}
