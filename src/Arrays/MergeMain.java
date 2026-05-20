package Arrays;

import java.util.Arrays;

class Solution29 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int length = intervals.length;
        int[][] res = new int[length][2];
        res[0] = intervals[0];
        int inRange = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= res[inRange][1]) {
                res[inRange][1] = Math.max(res[inRange][1], intervals[i][1]);
            } else {
                inRange++;
                res[inRange] = intervals[i];
            }
        }

        return Arrays.copyOfRange(res, 0, inRange + 1);
    }
}

public class MergeMain {

    public static void main(String[] args) {
        Solution29 S29 = new Solution29();

        int[][] result = S29.merge(new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        });

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
