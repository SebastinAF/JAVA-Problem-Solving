package GreedySolutions;

import java.util.Arrays;

class Solution03 {
    public int minimumCost(int[] cost) {

        int totalCost = 0;
        Arrays.sort(cost);
        int count = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (count < 2) {
                totalCost += cost[i];
                count++;
            } else {
                count = 0;
            }
        }

        return totalCost;
    }
}

public class MinimumCostMain {

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        System.out.println(S03.minimumCost(new int[]{1,2,3}));
    }
}
