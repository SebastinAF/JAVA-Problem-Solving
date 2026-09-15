package ArraysAndStrings;

class Solution28 {
    public int balancedStringSplit(String s) {

        int count = 0;
        int  sum = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') sum++;
            else sum--;

            if (sum == 0) count++;
        }

        return count;
    }
}

public class BalancedStringSplitMain {

    public static void main(String[] args) {
        Solution28 S28 = new Solution28();

        System.out.println(S28.balancedStringSplit("RLLLLRRRLR"));
    }
}
