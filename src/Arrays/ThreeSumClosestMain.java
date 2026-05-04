package Arrays;

import java.util.Arrays;

class Solution25 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        int nearestValue = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(nearestValue - target)) {
                    nearestValue = sum;
                }

                if (sum < target) left++;
                else if (sum > target) right--;
                else return sum;
            }
        }

        return nearestValue;
    }
}

public class ThreeSumClosestMain {

    public static void main(String[] args) {
        Solution25 S25 = new Solution25();

        System.out.println(S25.threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}
