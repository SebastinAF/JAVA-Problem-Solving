package Arrays;

import java.util.Arrays;

class Solution48 {
    public int[] sortedSquares(int[] nums) {

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (l == r) nums[l] = nums[l] * nums[l];
            else {
                nums[l] = nums[l] * nums[l];
                nums[r] = nums[r] * nums[r];
            }
            r--;
            l++;
        }
        Arrays.sort(nums);
        return nums;
    }
}

public class SortedSquaresMain {

    public static void main(String[] args) {
        Solution48 S48 = new Solution48();

        System.out.println(Arrays.toString(S48.sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
