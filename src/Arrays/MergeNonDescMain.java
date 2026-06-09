package Arrays;

import java.util.Arrays;

class Solution33 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}

public class MergeNonDescMain {

    public static void main(String[] args) {
        Solution33 S33 = new Solution33();

        int[] nums1 = {0};
        int[] nums2 = {1};

        S33.merge(nums1, 0, nums2, 1);

        for (int v : nums1) System.out.println(v);
    }
}
