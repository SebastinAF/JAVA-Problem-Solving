package SortinAlgorithms;

import java.util.Arrays;

class Solution06 {
    public int[] sortArray(int[] nums) {

        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;

        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        // Divide: recursively sort both halves.
        sortArray(left);
        sortArray(right);

        // Conquer: merge the two sorted halves.
        mergeSort(nums, left, right);

        return nums;
    }

    public void mergeSort(int[] nums, int[] left, int[] right) {

        int i = 0, j = 0, k =0;

        // Compare elements from both halves, pick smaller one.
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) nums[k++] = left[i++];
            else nums[k++] = right[j++];
        }

        // Copy remaining elements (if any) from left or right.
        while (i < left.length) nums[k++] = left[i++];
        while (j < right.length) nums[k++] = right[j++];

    }
}

public class MergeSortMain {

    public static void main(String[] args) {

        Solution06 S06 = new Solution06();
        System.out.println(Arrays.toString(S06.sortArray(new int[]{5,2,3,1,8,5,6,4,9,7})));
    }
}


/**
 * Time & Space Complexity :
 *      Case	       Complexity	      Reason
 *      Best	       O(n log n)	      -
 *      Average        O(n log n)	      -
 *      Worst	       O(n log n)	      Always guaranteed — data order matter panna
 *      Space	       O(n)	              Extra arrays venum merge panradhukku (in-place illa)
 */