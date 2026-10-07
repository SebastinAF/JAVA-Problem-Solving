package ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution40 {
    public List<String> removeInvalidParentheses(String s) {

        Set<String> list = new HashSet<>();

        int leftRemove = 0;
        int rightRemove = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') leftRemove++;
            else if (ch == ')') {
                if (leftRemove > 0) leftRemove--;
                else rightRemove++;
            }
        }

        backTrack(s, 0, leftRemove, rightRemove, 0, new StringBuilder(), list);

        List<String> result = list.stream().toList();
        return result;
    }

    public void backTrack(String s, int index, int leftRemove, int rightRemove, int balance, StringBuilder current, Set<String> list) {

        if (index == s.length()) {
            if (leftRemove == 0 && rightRemove == 0 && balance == 0) list.add(current.toString());
            return;
        }

        char ch = s.charAt(index);
        if (ch == '(' && leftRemove > 0) {
            backTrack(s, index + 1, leftRemove - 1,
                    rightRemove, balance, current, list
            );
        }

        if (ch == ')' && rightRemove > 0) {
            backTrack(s, index + 1, leftRemove,
                    rightRemove - 1, balance, current, list
                    );
        }

        current.append(ch);

        if (ch != '(' && ch != ')') {
            backTrack(s, index + 1, leftRemove,
                    rightRemove, balance, current, list
            );
        } else if (ch == '(') {
            backTrack(s, index + 1, leftRemove,
                    rightRemove, balance + 1, current, list
            );
        } else if (balance > 0) {
            backTrack(s, index + 1, leftRemove,
                    rightRemove, balance - 1, current, list
            );
        }

        current.deleteCharAt(current.length() - 1);
    }
}

public class RemoveInvalidParenthesesMain {

    public static void main(String[] args) {
        Solution40 S40 = new Solution40();

        System.out.println(S40.removeInvalidParentheses("()())()"));
    }
}
