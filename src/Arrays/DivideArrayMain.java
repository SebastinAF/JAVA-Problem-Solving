package Arrays;

import java.util.HashMap;
import java.util.Map;

class Solution55 {
    public boolean divideArray(int[] nums) {

        Map<Integer, Integer> mapResult = new HashMap<>();
        for (int i : nums) mapResult.put(i, mapResult.getOrDefault(i, 0) + 1);

        for (int i : mapResult.keySet()) if (mapResult.get(i) % 2 != 0) return false;
        return true;
    }
}

public class DivideArrayMain {

    public static void main(String[] args) {
        Solution55 S55 = new Solution55();

        System.out.println(S55.divideArray(new int[]{1,2,3,4}));
    }
}
