package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution22 {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}

public class FindMaxLengthMain {

    public static void main(String[] args) {
        Solution22 S22 = new Solution22();

        System.out.println(S22.findMaxLength(new int[]{0,1,1,1,1,1,0,0,0}));
    }
}
