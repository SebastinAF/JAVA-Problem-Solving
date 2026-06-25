package SlidingWindow;

class Solution03 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }

        return count;
    }
}

public class NumSubarrayProductLessThanKMain {

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        System.out.println(S03.numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100));
    }
}
