import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.nextLine());
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            s.setCharAt(i,(char)(s.charAt(i)+32));
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
            s.setCharAt(i,(char)(s.charAt(i)-32));
        }
        System.out.println(s);
    }
}
