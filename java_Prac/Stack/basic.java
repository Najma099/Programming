import java.util.Scanner;
import java.util.Stack;
public class basic {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();
        st.push(7);
        st.push(77);
        st.push(777);
        st.push(7777);
        st.push(88888);

        System.out.println(st);
        System.out.println(st.size());
        

        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        
    }
}
