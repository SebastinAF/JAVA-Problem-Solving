package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution51 {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int v : stones) queue.add(v);

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();

            if (x != y) queue.add(x - y);
        }

        if (queue.isEmpty()) return 0;

        return queue.poll();
    }
}

public class LastStoneWeightMain {

    public static void main(String[] args) {
        Solution51 S51 = new Solution51();

        System.out.println(S51.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
