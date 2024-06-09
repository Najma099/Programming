import java.util.Stack;

public class insertion {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        int idx = 2;
        int x = 6;
        Stack <Integer> gt = new Stack <>();
         
        while(st.size()> idx){
            gt.push(st.pop());
        }
      
        st.push(x);
        while(!gt.isEmpty())
        {
            st.push(gt.pop());
        }

        System.out.println(st);
    }
}
