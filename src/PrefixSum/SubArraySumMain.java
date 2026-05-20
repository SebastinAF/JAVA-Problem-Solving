package PrefixSum;

import java.util.HashMap;
import java.util.Map;

class Solution02 {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

public class SubArraySumMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        System.out.println(S02.subarraySum(new int[]{0, 0, 0}, 0));
    }
}
