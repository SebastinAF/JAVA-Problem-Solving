package ArraysAndStrings;

class Solution43 {
    public String maxSumOfSquares(int num, int sum) {

        if (sum > num * 9) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int digit = Math.min(sum, 9);
            result.append(digit);
            sum -= digit;
        }

        return result.toString();
    }
}

public class MaxSumOfSquaresMain {

    public static void main(String[] args) {
        Solution43 S43 = new Solution43();

        System.out.println(S43.maxSumOfSquares(4, 15));
    }
}
