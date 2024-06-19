import java.util.*;
public class prefixToPost {
    public static void main(String[] args) {
        String s ="-9/*+5346";
        Stack <String> st = new Stack <>();
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                st.push(String.valueOf(ch));
            else{
                String val1 = st.pop();
                String val2 = st.pop();
                st.push(val1 + val2 + ch);
            }
        }
        System.out.println(st.peek());
    }
}
