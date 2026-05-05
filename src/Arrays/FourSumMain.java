package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution26 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> l2 = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = nums[i] + nums[i + 1] + nums[left] + nums[right];

                    if (sum == target) {
                        l2.add(Arrays.asList(nums[i], nums[i + 1], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) left++;
                    else right--;
                }
            }
        }

        return l2;
    }
}

public class FourSumMain {
    public static void main(String[] args) {

        Solution26 S26 = new Solution26();

        System.out.println(S26.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
