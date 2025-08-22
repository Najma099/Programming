import java.util.Stack;
public class Infix {
    public static void main(String[] args) {
        String s= "9-(5+3*2)-4/2";
        Stack <Integer> val = new Stack <>();
        Stack <Character> opr = new Stack <>();

        for(int i = 0; i < s.length(); i++){
            int ascii = (int)s.charAt(i);

            if(ascii >= 48 && ascii <= 57)
                val.push(ascii-48);

            else if(opr.size() == 0 || s.charAt(i) == '(' || opr.peek() == '(')
                opr.push(s.charAt(i));

            else if(s.charAt(i) == ')'){
                while( opr.peek() != '('){
                    int var1 = val.pop();
                    int var2 = val.pop();

                    if(opr.peek() == '+')
                        val.push(var1 + var2);

                    else if(opr.peek() == '-')
                        val.push(var2 - var1);
                    
                    else if(opr.peek() == '*')
                        val.push(var2 * var1);

                    else 
                        val.push(var2 / var1);
                    
                    opr.pop();
                }
                opr.pop();
            }

            else{
                
                if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                    int var2 = val.pop();
                    int var1 = val.pop();

                    if(opr.peek() == '+')
                        val.push(var1 + var2);
                    else if(opr.peek() == '-')
                        val.push(var1 - var2);
                    else if(opr.peek() == '*')
                        val.push(var1 * var2);
                    else
                        val.push(var1/var2);
                    
                    opr.pop();
                    opr.push(s.charAt(i));

                }

                else if(s.charAt(i) == '*' || s.charAt(i) == '/'){
                    if(opr.peek() == '*' || opr.peek() == '/'){
                        int var2 = val.pop();
                        int var1 = val.pop();

                        if(opr.peek() =='*')
                            val.push(var2 * var1);
                        else if(opr.peek() == '/')
                            val.push(var2 / var1);

                        opr.pop();
                    }
                    else{
                        opr.push(s.charAt(i));
                    }
                }
            }
        }
        while(val.size() > 1){
            int var2 = val.pop();
            int var1 = val.pop();

            if(opr.peek() == '*')
                val.push(var2 * var1);
            else if(opr.peek() == '/')
                val.push(var1 / var2);
            else if(opr.peek() == '+')
                val.push(var2 + var1);
            else
                val.push(var1 - var2);
            
            opr.pop();
        }
        System.out.println(val.peek());
    }
}
