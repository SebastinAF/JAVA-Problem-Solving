package ArraysAndStrings;

import java.util.Stack;

class Solution38 {
    public int scoreOfParentheses(String s) {

//        int result = 0;
//        int val = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                val++;
//            } else {
//               val--;
//               if (s.charAt(i - 1) == '(') result += (1 << val);
//            }
//        }
//
//        return result;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(0);
            else {
                int inner = stack.pop();
                int value;

                if (inner == 0) value = 1;
                else value = 2 * inner;

                stack.push(stack.pop() + value);
            }
        }

        return stack.peek();
    }
}

public class ScoreOfParenthesesMain {

    public static void main(String[] args) {
        Solution38 S38 = new Solution38();

        System.out.println(S38.scoreOfParentheses("()()"));
    }
}
