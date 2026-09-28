package SortinAlgorithms;

import java.util.Arrays;

class Solution01 {
    public int[] sortArray(int[] nums) {

        // In each iteration the inner loop is arranging the value from last index i.e placing the
        // highest value in the order of last.
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            // Swapped variable is used for if no swapped happen then break
            boolean swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        return nums;
    }
}

public class BubbleSortMain {

    public static void main(String[] args) {

        Solution01 S01 = new Solution01();

        System.out.println(Arrays.toString(S01.sortArray(new int[]{1, 2, 6, 4, 5, 3})));
    }
}

/**
 * Time & Space Complexity :
 *
 * Case	                        Complexity	          Reason
 * Best (already sorted)	    O(n)	              swapped flag optimization irundha
 * Average	                    O(n²)                 -
 * Worst (reverse sorted)	    O(n²)	              Ella pass layum swap venum
 * Space	                    O(1)	              In-place, extra array venaam
 *
 */