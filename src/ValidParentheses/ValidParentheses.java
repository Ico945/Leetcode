package ValidParentheses;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.print(new ValidParentheses().isValid(""));
    }
    public boolean isValid(String s) {
        if(s.length()>0&&(s.charAt(0) == ')'||s.charAt(0) == '}'||s.charAt(0) == ']'))
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else {
                if(stack.empty())
                    return false;
                if(s.charAt(i) == ')'&&stack.pop() != '(')
                    return false;
                if(s.charAt(i) == '}'&&stack.pop() != '{')
                    return false;
                if(s.charAt(i) == ']'&&stack.pop() != '[')
                    return false;
            }
        }
        if(!stack.empty())
            return false;
        else
            return true;
    }
}
