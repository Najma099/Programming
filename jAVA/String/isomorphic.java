package String;


import java.util.Scanner;
public class isomorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        boolean flag =true;
        if(s.length()!=t.length())
        {
            flag=false;
        }
        int[] A=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int index=(int)(s.charAt(i)-97);
            if(A[index]==0 || A[index]==t.charAt(i))
            {
                A[index]=t.charAt(i);
            }
            else
            {
                flag=false;
                break;
            }
        }
        if(flag==false)
        System.out.println("False");
        else
        System.out.println("True");
        sc.close();
    }
}
