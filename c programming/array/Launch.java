/*
import java.io.*;

public class Solution {
    
    public static void main(String[] args) {
         // Write your code here
    }
}
*/
import java.util.*;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        //String b = " ";
        Stack < String > st = new Stack<> ();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
               st.push(sb.toString());
               st.push(" ");
               //sb = b.toStringBuilder();
               sb = new StringBuilder();
            }
            else
                sb.append(s.charAt(i));
        }
        st.push(sb.toString());
        while(st.size() > 0) {
            System.out.print(st.peek());
            st.pop();
        }
    }
}