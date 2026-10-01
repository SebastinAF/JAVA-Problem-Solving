package ArraysAndStrings;

import java.util.Stack;

class Solution34 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean edge = false;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                edge = true;
            } else if (!stack.isEmpty() && (ch == ')' && stack.peek() == '(' || ch == ']' && stack.peek() == '[' || ch == '}' && stack.peek() == '{')) {
                stack.pop();
            }
        }

        return stack.isEmpty() && edge;
    }
}

public class IsValidMain {

    public static void main(String[] args) {
        Solution34 S34 = new Solution34();

        System.out.println(S34.isValid("]"));
    }
}
