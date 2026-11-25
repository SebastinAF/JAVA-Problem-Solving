package Arrays;

import java.util.Arrays;

class Solution71 {
    public int minMoves(int[] nums) {

        int result = 0;
        Arrays.sort(nums);
        int lastValue = nums[nums.length - 1];

        for (int i : nums) result += (lastValue - i);

        return result;
    }
}

public class MinMovesMain {

    public static void main(String[] args) {
        Solution71 S71 = new Solution71();

        System.out.println(S71.minMoves(new int[]{4, 4, 5}));
    }
}
