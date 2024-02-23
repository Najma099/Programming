
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n:");
        int n= sc.nextInt();
        System.out.print("Enter the search element:");
        int x= sc.nextInt();
        System.out.print("Enter the array:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean flag = false;
        for(int j=0;j<n;j++)
        {
            if(x==arr[j])
            {
                flag= true;
                break;
            }
        }
        if(flag==true)System.out.print("Element Found");
        else System.out.print("Element not Found");
        sc.close();

    }
    

}
