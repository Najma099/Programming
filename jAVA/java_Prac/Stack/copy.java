import java.util.Stack;
public class copy{
    public static Stack <Integer> copyy(Stack<Integer> st)
    {
        Stack<Integer> s1= new Stack<>();
        while(!st.isEmpty()){
            s1.push(st.pop());
        }

        Stack<Integer> s2= new Stack<>();
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
         
        return s2;
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        Stack <Integer> s = new Stack <>();
        s=copyy(st);
        System.out.println(s);
    }
}