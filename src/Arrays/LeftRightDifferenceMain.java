package Arrays;

import java.util.Arrays;

class Solution46 {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        leftSum[0] = 0;
        rightSum[len - 1] = 0;

        int l = 1, r = len - 2;
        while (l < len) {
            leftSum[l] = nums[l - 1] + leftSum[l - 1];
            rightSum[r] = nums[r + 1] + rightSum[r + 1];
            l++;
            r--;
        }

        for (int  i = 0; i < len; i++) nums[i] = Math.abs(leftSum[i] - rightSum[i]);

        return nums;
    }
}

public class LeftRightDifferenceMain {

    public static void main(String[] args) {
        Solution46 S46 = new Solution46();

        System.out.println(Arrays.toString(S46.leftRightDifference(new int[]{10})));
    }
}
