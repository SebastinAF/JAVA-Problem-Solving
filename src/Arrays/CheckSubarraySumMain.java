package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution45 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int remainder = prefixSum % k;
            if (result.containsKey(remainder)) {
                if (i - result.get(remainder) >= 2) return true;
            } else result.put(remainder, i);
        }

        return false;
    }
}

public class CheckSubarraySumMain {

    public static void main(String[] args) {
        Solution45 S45 = new Solution45();
        System.out.println(S45.checkSubarraySum(new int[]{23,2,4,6,7}, 6));
    }
}
