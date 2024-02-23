//to find sum of a target element from a array
package ARRAY_LIST;
import java.util.ArrayList;
import java.util.Scanner;
public class twosum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int N=sc.nextInt();
        final ArrayList<Integer> arr = new ArrayList<>(N);
        for(int i=0;i<N;i++)
        {
            int input=sc.nextInt();
            arr.add(input);
        }
        System.out.print("Enter the target element T:");
        int T=sc.nextInt();
        for(int j=0;j<arr.size();j++)
        {
            boolean pairFound= false;
            for(int k=j+1;k<arr.size();k++)
            {
                if(arr.get(j)+arr.get(k)==T)
               {
                System.out.print(j+" "+k);
                pairFound= true;
                break;
               }
                
            }
            if(pairFound==true)
            break;
        }
        
        sc.close();
    }
}