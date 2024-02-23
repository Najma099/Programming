
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter marks:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println( "the array lenght:"+arr.length+" ");
        for(int j=0 ;j<n;j++)
        {

            if(arr[j]<35)
            {
                System.out.print( "the roll no :"+j+" ");
            }
        }
        sc.close();
   }
}
