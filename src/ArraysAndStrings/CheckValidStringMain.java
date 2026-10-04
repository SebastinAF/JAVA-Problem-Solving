package ArraysAndStrings;


import java.util.Stack;

class Solution36 {
    public boolean checkValidString(String s) {

        int low = 0, high = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                low--;
                high--;
            } else {
                low--;
                high++;
            }

            if (high < 0) return false;

            low = Math.max(0, low);
        }

        return low == 0;
    }
}

public class CheckValidStringMain {

    public static void main(String[] args) {
        Solution36 S36 = new Solution36();

        System.out.println(S36.checkValidString("("));
    }
}
