import java.util.Stack;
public class print {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();
        st.push(7);
        st.push(77);
        st.push(777);
        st.push(7777);
        st.push(88888);

        Stack <Integer> gt = new Stack <>();
        while(!st.isEmpty())
        {
            gt.push(st.pop());
        }

        while(!gt.isEmpty())
        {
            System.out.print(gt.peek() +" ");
            st.push(gt.pop());
        }
        
        //System.out.print(st);
    }
}
