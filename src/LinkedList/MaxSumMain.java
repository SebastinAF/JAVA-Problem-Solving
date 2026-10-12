package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Solution08 {
    public int maxSum(List<Integer> nums, int k) {

        int mod = 1_000_000_007;
        int[] bitCount = new int[32];

        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) bitCount[i]++;
            }
        }

        long answer = 0;
        for (int i = 0; i < k; i++) {
            long value = 0;

            for (int j = 31; j >= 0; j--) {
                if (bitCount[j] > 0) {
                    value |= (1 << j);
                    bitCount[j]--;
                }
            }

            answer = (answer + value * value) % mod;
        }

        return (int) answer;
    }
}

public class MaxSumMain {

    public static void main(String[] args) {
        Solution08 S08 = new Solution08();

        int[] arr = {2, 6, 5, 8};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        System.out.println(S08.maxSum(list, 2));
    }
}
