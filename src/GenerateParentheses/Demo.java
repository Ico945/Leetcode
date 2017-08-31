package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Demo().generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        char[] str = new char[n * 2];
        helper(list, str, n, 0, n, n);
        return list;
    }
    public void helper(List<String> list, char[] str, int n, int pos, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(new String(str));
            return;
        }
        if (left > 0) {
            str[pos] = '(';
            helper(list, str, n, pos + 1, left - 1, right);
        }
        if (right > left) {
            str[pos] = ')';
            helper(list, str, n, pos + 1, left, right - 1);
        }
    }
}
