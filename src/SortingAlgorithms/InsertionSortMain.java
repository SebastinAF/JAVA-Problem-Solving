package SortinAlgorithms;

import java.util.Arrays;

class Solution03 {
    public int[] sortArray(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int n = i;
            int current = nums[i];
            while (n > 0 && nums[n - 1] > current) {
                nums[n] = nums[n - 1];
                n--;
            }
            nums[n] = current;
        }

        return nums;
    }
}

public class InsertionSortMain {

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        System.out.println(Arrays.toString(S03.sortArray(new int[]{2, 6, 4, 5, 3, 1})));
    }
}
