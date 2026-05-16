package Arrays;

import java.util.Arrays;

class Solution28 {
    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        if (nums[n - 1] != n - 1 || nums[n - 2] != n - 1) return false;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] != i + 1) return false;
        }

        return true;
    }
}

public class IsGoodMain {

    public static void main(String[] args) {
        Solution28 S28 = new Solution28();

        System.out.println(S28.isGood(new int[]{5, 7, 3, 1, 5, 2, 6, 4}));
    }
}
