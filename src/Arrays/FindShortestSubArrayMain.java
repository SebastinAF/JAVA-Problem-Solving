package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution23 {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            count.put(num, count.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);
        }

        int degree = 0;
        for (int freq : count.values()) degree = Math.max(degree, freq);

        int resultLength = nums.length;
        for (int val : count.keySet()) {

            if (count.get(val) == degree) {
                int length = last.get(val) - first.get(val) + 1;
                resultLength = Math.min(resultLength, length);
            }
        }

        return resultLength;
    }
}

public class FindShortestSubArrayMain {

    public static void main(String[] args) {
        Solution23 S23 = new Solution23();

        System.out.println(S23.findShortestSubArray(new int []{1,2,2,3,1,4,2}));

    }
}
