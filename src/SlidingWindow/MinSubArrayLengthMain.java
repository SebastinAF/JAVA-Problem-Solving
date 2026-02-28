package SlidingWindow;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        int low = 0;
        int high = 0;

        while (high < nums.length) {

            currentSum += nums[high];
            high++;

            while (currentSum >= target) {

                int currentLength = high - low;

                minLength = Math.min(minLength, currentLength);
                currentSum -= nums[low];
                low++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

public class MinSubArrayLengthMain {

    public static void main(String[] args) {

        Solution S01 = new Solution();
        System.out.println(S01.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));

    }
}
