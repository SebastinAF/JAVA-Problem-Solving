package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution38 {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        for (int[] value : intervals) {
            if (value[1] < newInterval[0]) {
                result.add(value);
            } else if (value[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = value;
            } else {
                newInterval[0] = Math.min(value[0], newInterval[0]);
                newInterval[1] = Math.max(value[1], newInterval[1]);
            }
        }
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}

public class InsertMain {
    public static void main(String[] args) {
        Solution38 S38 = new Solution38();

        int[][] result =  S38.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4, 8});

        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
    }
}
