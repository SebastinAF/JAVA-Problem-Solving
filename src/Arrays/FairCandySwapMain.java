package Arrays;

import java.util.Arrays;

class Solution43 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumOfArr1 = 0;
        int sumOfArr2 = 0;

        for (int v : aliceSizes) sumOfArr1 += v;
        for (int v : bobSizes) sumOfArr2 += v;

        for (int aliceSize : aliceSizes) {
            for (int bobSize : bobSizes) {
                int temp1 = sumOfArr1 - aliceSize;
                int temp2 = sumOfArr2 - bobSize;
                if (temp1 + bobSize == temp2 + aliceSize) return new int[]{aliceSize, bobSize};
            }
        }

        return new int[]{};
    }
}

public class FairCandySwapMain {
    public static void main(String[] args) {
        Solution43 S43 = new Solution43();

        int[] answer = S43.fairCandySwap(new int[]{2}, new int[]{1,3});

        System.out.println(Arrays.toString(answer));
    }
}
