package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution54 {
    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i : nums) resultMap.put(i, resultMap.getOrDefault(i, 0) + 1);

        int numInd = 0;
        while (!resultMap.isEmpty()) {

            int min = Integer.MAX_VALUE;
            int keyValue = 0;

            for (int i : resultMap.keySet()) {
                if (min > resultMap.get(i)) {
                    min = resultMap.get(i);
                    keyValue = i;
                } else if (min == resultMap.get(i) && keyValue < i) keyValue = i;
            }

            int indCount = 0;
            while (indCount < min) {
                nums[numInd] = keyValue;
                numInd++;
                indCount++;
            }

            resultMap.remove(keyValue);
        }

        return nums;
    }
}

public class FrequencySortMain {

    public static void main(String[] args) {
        Solution54 S54 = new Solution54();

        System.out.println(Arrays.toString(S54.frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1})));
    }
}
