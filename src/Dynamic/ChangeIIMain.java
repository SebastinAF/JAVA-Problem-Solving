package Dynamic;

import java.util.Arrays;

class Solution06 {
    public int change(int amount, int[] coins) {

        int[][] result = new int[coins.length][amount + 1];

        for (int i = 0; i < coins.length; i++) result[i][0] = 1;

        for (int i = 1; i <= amount; i++) if (i % coins[0] == 0) result[0][i] = 1;

        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j < coins[i]) {
                    result[i][j] = result[i - 1][j];
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - coins[i]];
                }
            }
        }

        return result[coins.length - 1][amount];
    }
}

public class ChangeIIMain {

    public static void main(String[] args) {
        Solution06 S06 = new Solution06();

        System.out.println(S06.change(10, new int[]{1, 2, 5, 10}));
    }
}
