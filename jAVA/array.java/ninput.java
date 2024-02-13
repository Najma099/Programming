
import java.util.Scanner;
public class ninput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element of array:");
            arr[i]= sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        sc.close();
    }
}
