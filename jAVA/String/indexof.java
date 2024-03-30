package String;
import java.util.Scanner;
public class indexof {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        //System.out.print(s.indexOf('a'));
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                System.out.print(i);
                break; 
            }
        }
        sc.close();
    }
}
