package SortinAlgorithms;

import java.util.Arrays;

class Solution04 {
    public int[] sortArray(int[] nums) {

        // A Selection Sort that swaps value by finding the unsorted minimum value from the
        // array and swaps with the current[i] index.

        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {

            int min = nums[i];
            int jIndex = 0;
            for (int j = i + 1; j < length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    jIndex = j;
                }
            }

            if (nums[i] != min) {
                int temp = nums[i];
                nums[i] = min;
                nums[jIndex] = temp;
            }

        }

        return nums;
    }
}

public class SelectionSort02Main {

    public static void main(String[] args) {

        Solution04 S04 = new Solution04();
        System.out.println(Arrays.toString(S04.sortArray(new int[]{5,2,3,1,8,5,6,4,9,7})));

    }
}
