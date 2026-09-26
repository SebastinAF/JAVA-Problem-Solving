package Arrays;

import java.util.Arrays;

class Solution57 {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int v1 = nums[nums.length - 1];
        int v2 = nums[0];
        while (v2 > 0) {

            if (v1 % v2 == 0) return v2;

            int diff = v1 % v2;
            v1 = v2;
            v2 = diff;
        }

        return 1;
    }
}

public class FindGCDMain {
    public static void main(String[] args) {
        Solution57 S57 = new Solution57();

        System.out.println(S57.findGCD(new int[]{2,5,6,9,10}));
    }
}
