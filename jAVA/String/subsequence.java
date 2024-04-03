package String;
import java.util.Scanner;
public class subsequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String c=sc.nextLine();
        int k=0;
        for(int a=0;a<c.length();a++)
        {
            for(int i=0;i<c.length();i++)
            {
                k=1;
                for(int j=i;j>=0;j++)
                {
                    System.out.println(c.substring(i,k));
                    k++;
                }
            }  
        }
        
        sc.close();
    }
}
