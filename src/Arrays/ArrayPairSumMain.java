package Arrays;

import java.util.Arrays;

class Solution04 {
    public int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        int i = 0;
        int j = 1;

        while (i < nums.length - 1) {
            result += Math.min(nums[i], nums[j]);
            i += 2;
            j += 2;
        }
        return result;
    }
}

public class ArrayPairSumMain {
    public static void main(String[] args) {
        Solution04 S04 = new Solution04();

        System.out.println(S04.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}
