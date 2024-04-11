
import java.util.Scanner;
public class inp {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        StringBuilder sb= new StringBuilder(sc.next());
        System.out.println(sb);
        StringBuilder st=new StringBuilder(sc.next());
        System.out.println(st);
        System.out.println(sb.compareTo(st));
    }
}
