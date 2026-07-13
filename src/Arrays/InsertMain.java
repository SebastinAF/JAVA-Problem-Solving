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
}
