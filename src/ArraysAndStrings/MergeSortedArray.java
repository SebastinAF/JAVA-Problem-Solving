package ArraysAndStrings;

import java.util.Arrays;

class Solution01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //initializing variables with the values which needs to be merge from indexes.
        for(int i = m, j = 0; i < m + n; i++){
            //merging both arrays into single array.
            nums1[i] = nums2[j];
            j++;
        }

        //Now Sorting array nums1 finally.
        Arrays.sort(nums1);
    }
}

public class MergeSortedArray {

    public static void main(String[] args) {

        Solution01 s01 = new Solution01();

        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;

        s01.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
