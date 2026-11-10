package Arrays;

import java.util.*;

class Solution67 {

    class Pair {
        int value;
        int index;
        int digitSum;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
            this.digitSum = getDigitSum(value);
        }
    }

    public int minSwaps(int[] nums) {

        int n = nums.length;
        Pair[] arr = new Pair[n];

        // Store values with their original indices
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        // Sort by digit sum, then by actual value
        Arrays.sort(arr, (a, b) -> {
            if (a.digitSum != b.digitSum) {
                return a.digitSum - b.digitSum;
            }

            return a.value - b.value;
        });

        boolean[] visited = new boolean[n];
        int swapCount = 0;

        // Count cycles
        for (int i = 0; i < n; i++) {

            if (visited[i] || arr[i].index == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                j = arr[j].index;
                cycleSize++;
            }

            swapCount += cycleSize - 1;
        }

        return swapCount;
    }

    private int getDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}

public class MinSwapsMain {

    public static void main(String[] args) {

        Solution67 s67 = new Solution67();

        System.out.println(
                s67.minSwaps(new int[]{18, 43, 34, 16})
        );
    }
}

