import java.util.*;

public class consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,2,2,3,10,10,10,7,8,9};
        int[] res = remove(arr);
        stack <Integer> st = new Stack <>();
        boolean flag=true;

        for(int i = 0; i < arr.length; i++){
            if(st.isEmpty())
                st.push(arr[i]);
            else if(st.peek()==S.arr[i]){
                flag=false;
                continue;
            }
            else if(flag==false)
            {
                st.pop();
                flag=true;
                st.push(S.charAt(i));
            }

        }
    
    }
}
