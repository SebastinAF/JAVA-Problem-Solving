package Arrays;

import java.util.Arrays;

class Solution39 {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) left++;

            if (nums[right] % 2 == 1) right--;
        }

        return nums;
    }
}

public class SortArrayByParityMain {

    public static void main(String[] args) {
        Solution39 S39 = new Solution39();

        System.out.println(Arrays.toString(S39.sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
}
