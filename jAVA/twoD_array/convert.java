
import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String S=sc.nextLine();
        String[] T=new String[S.length()];
        for(int i=0;i<S.length();i++)
        {
            if(i%2==0)
            T[i]="a";
            else
            T[i]=String.valueOf(S.charAt(i));
        }
        for (String value : T) {
            System.out.print(value + " ");
        }
    }
}
