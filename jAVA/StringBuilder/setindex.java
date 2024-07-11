package StringBuilder;


import java.util.Scanner;

public class setindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.next());
        System.out.println(s);
        s.setCharAt(1,'a');
        System.out.println(s);
        sc.close();
    }
}
