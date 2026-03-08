package Arrays;

class Solution0901 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] result = new int[2];

        for (int i : nums1)
            for (int j : nums2)
                if (i == j) {
                    result[0]++;
                    break;
                }

        for (int i : nums2)
            for (int j : nums1)
                if (i == j) {
                    result[1]++;
                    break;
                }
        return result;
    }
}

public class FindIntersectionValuesMain {

    public static void main(String[] args) {
        Solution0901 S0901 = new Solution0901();

        int[] r = S0901.findIntersectionValues(new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6});

        for (int b : r)
            System.out.println(b);
    }
}
