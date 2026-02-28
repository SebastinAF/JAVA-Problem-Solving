package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution03 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return lists;
    }
}

public class Sum3Main {

    public static void main(String[] args) {

        Solution03 S03 = new Solution03();

        System.out.println(S03.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
