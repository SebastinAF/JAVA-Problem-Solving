package Arrays;

import java.util.Arrays;

class Solution15 {
    public int minNumber(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) return nums1[i];
            }
        }
        String s = nums1[0] + "" + nums2[0];
        return Integer.parseInt(s);
    }
}

public class MinNumberMain {

    public static void main(String[] args) {
        Solution15 S15 = new Solution15();

        System.out.println(S15.minNumber(new  int[]{3,5,2,6}, new int[]{3,1,7}));
    }
}
