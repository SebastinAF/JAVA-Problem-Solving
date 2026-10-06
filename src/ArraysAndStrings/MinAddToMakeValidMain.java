package ArraysAndStrings;

import java.util.Stack;

class Solution39 {
    public int minAddToMakeValid(String s) {

//        Stack<Character> stack = new Stack<>();
//
//        int count = 0;
//        for (char ch : s.toCharArray()) {
//            if (ch == '(') stack.push(ch);
//            else if (!stack.isEmpty()) stack.pop();
//            else count++;
//        }
//
//        return count + stack.size();

        int open = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') open++;
            else if (open > 0) open--;
            else count++;
        }

        return count + open;
    }
}

public class MinAddToMakeValidMain {

    public static void main(String[] args) {
        Solution39 S39 = new Solution39();

        System.out.println(S39.minAddToMakeValid("((("));
    }
}
