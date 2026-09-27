package Stack;

import java.util.Stack;

class Solution01 {
    public String reverseParentheses(String s) {

        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(str);
                str = new StringBuilder();
            } else if (c == ')') {
                str.reverse();
                str = stack.pop().append(str);
            } else {
                str.append(c);
            }
        }

        return str.toString();
    }
}

public class ReverseParenthesesMain {

    public static void main(String[] args) {

        Solution01 S01 = new Solution01();

        System.out.println(S01.reverseParentheses("(ed(et(oc))el)"));

    }
}
