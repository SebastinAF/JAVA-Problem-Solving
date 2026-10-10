package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution60 {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        PriorityQueue<Integer> result = new PriorityQueue<>(Collections.reverseOrder());

        int sum1 = 0;
        long k = (long) k1 + k2;

        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            result.add(diff);
            sum1 += diff;
        }

        if (sum1 <= k) return 0;

        while (k > 0) {
            int largest = result.poll();

            if (largest == 0) {
                result.add(0);
                break;
            }

            result.add(largest - 1);
            k--;
        }

        long sum = 0;
        while (!result.isEmpty()) {
            long temp = result.poll();
            sum += temp * temp;
        }

        return  sum;
    }
}

public class MinSumSquareDiffMain {

    public static void main(String[] args) {
        Solution60 S60 = new Solution60();

        System.out.println(S60.minSumSquareDiff(new int[]{10,10,10,11,5}, new int[]{1,0,6,6,1}, 11, 27));
    }
}
