package String;


import java.util.Scanner;
public class updata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T="";
        for(int i=0;i<S.length();i++)
        {
            if(i%2!=0)
            {
               T += 'a';
            }
            else
            T += S.charAt(i);
        }
        System.out.print(T);
        sc.close();
    }
}
