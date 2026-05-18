package Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution27 {
    public long maximumSubarraySum(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        int left = 0;
        long maxSum = 0, currentSum = 0;
        for (int num : nums) {

            while (set.contains(num) || set.size() == k) {
                currentSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            currentSum += num;
            set.add(num);
            if (set.size() == k) maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}

public class MaximumSubarraySumMain {

    public static void main(String[] args) {

        Solution27 S27 = new Solution27();

        System.out.println(S27.maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3));
    }
}
