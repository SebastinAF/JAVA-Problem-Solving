package GreedySolutions;

class Solution04 {
    public int largestInteger(int n, int s) {

        if (s > 9 * n) return -1;
        if (s == 0) return 0;

        int result = 0;
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            result  = result * 10 + digit;
            s -= digit;
        }

        return result;
    }
}

public class LargestIntegerMain {

    public static void main(String[] args) {
        Solution04 S04 = new Solution04();

        System.out.println(S04.largestInteger(2, 9));
    }
}
