package ArraysAndStrings;

class Solution42 {
    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') open++;
            else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') i++;
                else insertions++;

                if (open > 0) open--;
                else insertions++;
            }
        }

        return insertions + open * 2;
    }
}

public class MinInsertionsMain {

    public static void main(String[] args) {
        Solution42 S42 = new Solution42();

        System.out.println(S42.minInsertions("))())("));
    }
}
