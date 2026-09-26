package Arrays;

import java.util.Arrays;

class Solution57 {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        return min;
    }
}

public class FindGCDMain {
    public static void main(String[] args) {
        Solution57 S57 = new Solution57();

        System.out.println(S57.findGCD(new int[]{2,5,6,9,10}));
    }
}
