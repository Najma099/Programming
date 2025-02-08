/*
import java.io.*;

public class Solution {
    
    public static void main(String[] args) {
         // Write your code here
    }
}
*/
import java.util.*;

public class launch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] srr = s.split(" ");
        for(int i = srr.length - 1; i >= 0; i--) {
            System.out.print(srr[i] + " ");
        }
    }
}