package Dynamic;

import java.util.Arrays;

class Solution01 {
    public int coinChange(int[] coins, int amount) {

        int[] d = new int[amount + 1];
        Arrays.fill(d, amount + 1);

        d[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {
                if (i >= coin) {
                    d[i] = Math.min(d[i], d[i - coin] + 1);
                }
            }
        }

        return d[amount] > amount ? -1 : d[amount];
    }
}

public class CoinChangeMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.coinChange(new int[]{1,2,5}, 11));
    }
}
