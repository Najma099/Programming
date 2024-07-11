import java.util.*;
public class postfixCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String s = "953+4*6/-";
        Stack<Integer> st = new Stack<>();

        for(int i=0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                st.push(Character.getNumericValue(ch));
            else{
                int var1 = st.pop();
                int var2 = st.pop();
                if(ch == '*')
                    st.push(var2 * var1);
                else if(ch == '/')
                    st.push(var2 / var1);
                else if(ch == '+')
                    st.push(var2 + var1);
                else
                    st.push(var2 - var1);
            }
        }
        System.out.print(st.peek());
        sc.close();
    }
}
