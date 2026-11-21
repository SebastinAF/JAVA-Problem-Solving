package Arrays;

import java.util.Arrays;

class Solution69 {
    public int minimizeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        min = Math.min(min, nums[n - 1] - nums[2]);
        min = Math.min(min, nums[n - 2] - nums[1]);
        min = Math.min(min, nums[n - 3] - nums[0]);

        return min;
    }
}

public class MinimizeSumMain {

    public static void main(String[] args) {
        Solution69 S69 = new Solution69();

        System.out.println(S69.minimizeSum(new int[]{1,4,7,8,5}));
    }
}
