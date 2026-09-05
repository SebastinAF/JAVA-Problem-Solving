package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution10 {
    public int numEquivDominoPairs(int[][] dominoes) {

        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            String str = a + "," + b;
            if (map.containsKey(str)) count += map.get(str);

            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return count;
    }
}

public class NumEquivDominoPairsMain {

    public static void main(String[] args) {
        Solution10 S10 = new Solution10();

        System.out.println(S10.numEquivDominoPairs(new int[][]{
                {1,2}, {2,1}, {3,4}, {5,6}
        }));
    }
}
