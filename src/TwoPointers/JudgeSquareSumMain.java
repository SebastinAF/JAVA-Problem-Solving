package TwoPointers;

class Solution04 {
    public boolean judgeSquareSum(int c) {

        int i = 0;
        int maxLimit =(int) Math.sqrt(c);

        while (i < maxLimit) {
            int remaining = c - (i * i);
            int j = (int) Math.sqrt(remaining);
            if (j * j == remaining) return true;
            i++;
        }

        return false;
    }
}

public class JudgeSquareSumMain {

    public static void main(String[] args) {
        Solution04 S04 = new Solution04();

        System.out.println(S04.judgeSquareSum(3));
    }
}
