package Arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution41 {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int limit = 6000;

        Set<Integer> set = new HashSet<>();
        for (int v : forbidden) set.add(v);

        boolean[][] visited = new boolean[limit + 1][2];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0});

        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int pos = curr[0];
            int steps = curr[1];
            int back = curr[2];

            if (pos == x) return steps;

            int forward = pos + a;
            if (forward <= limit && !set.contains(forward) && !visited[forward][0]) {
                visited[forward][0] = true;
                queue.offer(new int[]{forward, steps + 1, 0});
            }

            int backward = pos - b;
            if (back == 0 && backward >= 0 && !set.contains(backward) && !visited[backward][1]) {
                visited[backward][1] = true;
                queue.offer(new int[]{backward, steps + 1, 1});
            }
        }

        return -1;
    }
}

public class MinimumJumpsMain {

    public static void main(String[] args) {
        Solution41 S41 = new Solution41();

        System.out.println(S41.minimumJumps(new int[]{1,6,2,14,5,17,4}, 16, 9, 7));
    }
}
