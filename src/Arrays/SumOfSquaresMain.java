package Arrays;

class Solution61 {
    public int sumOfSquares(int[] nums) {

        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n ; i++) {
            if (n % (i + 1) == 0) result += nums[i] * nums[i];
        }

        return result;
    }
}

public class SumOfSquaresMain {

    public static void main(String[] args) {
        Solution61 S61 = new Solution61();

        System.out.println(S61.sumOfSquares(new int[]{2,7,1,19,18,3}));
    }
}
