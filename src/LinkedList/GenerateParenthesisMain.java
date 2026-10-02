package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Solution07 {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }

        if (open < n) backtrack(list, s + "(", open + 1, close, n);
        if (close < open) backtrack(list, s + ")", open, close + 1, n);
    }
}

public class GenerateParenthesisMain {

    public static void main(String[] args) {
        Solution07 S07 = new Solution07();

        System.out.println(S07.generateParenthesis(4));
    }
}
