import java.util.*;

public class consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1,2,2,3,10,10,10,7,8,9};
        int[] res = new int[arr.length];
        int n = arr.length;

        res[n-1] = -1;
        Stack <Integer> st = new Stack <>();
        st.push(arr[n-1]);
         
        for(int i = n-2 ; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            if(st.isEmpty())
                res[i] = -1;

            else 
                res[i] = st.peek();

            st.push(arr[i]);
        }

       for(int ele: res)
       {
            System.out.print(ele + " ");
       } 
        
    
    }
}
