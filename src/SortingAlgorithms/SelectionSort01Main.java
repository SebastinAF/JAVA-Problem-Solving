package SortinAlgorithms;

import java.util.Arrays;

class Solution02 {
    public int[] sortArray(int[] nums) {


        // This is a variation of Selection Sort that swaps values whenever the nums[i] is greater
        // with the comparing nums[j] value. (But not an actual Selection sort algorithm due to multiple swaps.)
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}

public class SelectionSort01Main {

    public static void main(String[] args) {

        Solution02 S02 = new Solution02();
        System.out.println(Arrays.toString(S02.sortArray(new int[]{5,2,3,1})));
    }
}
