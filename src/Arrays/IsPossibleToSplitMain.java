package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution31 {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int v : nums) {
            map.put(nums[v], map.getOrDefault(nums[v], 0) + 1 );

            if (map.get(nums[v]) > 2) return false;
        }

        return true;
    }
}

public class IsPossibleToSplitMain {

    public static void main(String[] args) {
        Solution31 S31 = new Solution31();

        System.out.println(S31.isPossibleToSplit(new int[]{1,1,2,2,3,4}));
    }
}
