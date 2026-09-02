package HashMap;

import java.util.*;

class Solution09 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (map.containsKey(grid[i][j])) {
                    map.put(grid[i][j], map.get(grid[i][j]) + 1);
                } else map.put(grid[i][j], 1);
            }
        }

        int v = 1;

        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                result[0] = i;
                break;
            }
        }

        for (int i : map.keySet()) {
            if (v != i) {
                result[1] = v;
                break;
            }
            v++;
        }
        if (result[1] == 0) result[1] = v;
        return result;
    }
}

public class FindMissingAndRepeatedValuesMain {

    public static void main(String[] args) {
        Solution09 S09 = new Solution09();

        System.out.println(Arrays.toString(S09.findMissingAndRepeatedValues(new int[][]{
                {1, 3}, {2, 2}
        })));
    }
}
