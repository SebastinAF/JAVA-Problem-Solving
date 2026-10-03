package ArraysAndStrings;

import java.util.Stack;

class Solution35 {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        //Make sure to contain the initial boundary value
        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                //To make sure whether the substring is continuing or broken.
                stack.pop();
                //if empty means make it to contain the current index which is the staring index of substring.
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    //calculating the size of the current substring length and finding the maximum length.
                    int length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }
}

public class LongestValidParenthesesMain {

    public static void main(String[] args) {
        Solution35 S35 = new Solution35();

        System.out.println(S35.longestValidParentheses("(())"));
    }
}
