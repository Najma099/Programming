package StringBuilder;


import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder s= new StringBuilder(sc.next());
        StringBuilder a=new StringBuilder(sc.next());
        StringBuilder t= new StringBuilder(s).reverse();
        System.out.println(a.compareTo(t));
        sc.close();
    }
}
