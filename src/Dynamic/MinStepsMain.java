package Dynamic;

import java.util.Map;

class Solution05 {
    public int minSteps(int n) {

        int[] dpArr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dpArr[i] = i;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) dpArr[i] = Math.min(dpArr[i], dpArr[i] + (i / j));
            }
        }

        return dpArr[n];
    }
}

public class MinStepsMain {
    public static void main(String[] args) {
        Solution05 S05 = new Solution05();

        System.out.println(S05.minSteps(4));
    }
}
