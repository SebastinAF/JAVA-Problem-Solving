package ArraysAndStrings;

class Solution41 {
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c =='(') {
                if (depth > 0) sb.append(c);

                depth++;
            }
            else {
                depth--;

                if (depth > 0) sb.append(c);
            }
        }

        return sb.toString();
    }
}

public class RemoveOuterParenthesesMain {

    public static void main(String[] args) {
        Solution41 S41 = new Solution41();

        System.out.println(S41.removeOuterParentheses("(()())(())(()(()))"));
    }
}
