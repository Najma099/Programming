package String;
import java.util.Scanner;
public class charat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(s.charAt(4));
        int n= s.length();
        System.out.print(n);
        sc.close();
    }
   
}
