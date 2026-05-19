package PrefixSum;

class Solution01 {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        for (int n : nums) totalSum += n;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) return i;

            leftSum += nums[i];
        }
        return -1;
    }
}

public class PivotIndexMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
