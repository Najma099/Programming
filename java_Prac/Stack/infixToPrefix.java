import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        String S = "9-(5+3)*4/6";                     
        Stack<String> val = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch))
                val.push(String.valueOf(ch));
            else if (opr.empty() || opr.peek() == '(' || ch == '(')
                opr.push(ch);
            else if (ch == ')') {
                while (opr.peek() != '(') {
                    String val1 = val.pop();
                    String val2 = val.pop();
                    char oprr = opr.pop();
                    val.push(oprr + val2 + val1);
                }
                opr.pop();
            } else if (ch == '+' || ch == '-') {
                while (!opr.isEmpty() && (opr.peek() == '*' || opr.peek() == '/')) {
                    String val1 = val.pop();
                    String val2 = val.pop();
                    char oprr = opr.pop();
                    val.push(oprr + val2 + val1);
                }
                opr.push(ch);
            } else if (ch == '*' || ch == '/') {
                opr.push(ch);
            }
        }

        while (!opr.isEmpty()) {
            String val1 = val.pop();
            String val2 = val.pop();
            char oprr = opr.pop();
            val.push(oprr + val2 + val1);
        }
        System.out.print(val.peek());
    }
}
