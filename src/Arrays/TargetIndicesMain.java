package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution64 {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();

//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > target) break;
//            if (nums[i] == target) result.add(i);
//        }

        int lessCount = 0;
        int targetCount = 0;
        for (int i : nums) {
            if (i < target) lessCount++;
            else if (target == i) targetCount++;
        }

        for (int i = 0; i < targetCount; i++) result.add(lessCount + i);

        return result;
    }
}

public class TargetIndicesMain {

    public static void main(String[] args) {
        Solution64 S64 = new Solution64();

        System.out.println(S64.targetIndices(new int[]{1,2,5,2,3}, 2));
    }
}
