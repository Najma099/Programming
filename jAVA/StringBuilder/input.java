package StringBuilder;


import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb);
        sc.close();
    }
}
