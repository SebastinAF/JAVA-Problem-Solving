package TwoPointers;

import java.util.Arrays;

class Solution01 {
    public int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];
        int left = 0, right = numbers.length - 1;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[left] + numbers[right] == target) {
                arr[0] = left;
                arr[1] = right;
                break;
            }

            if (numbers[left] + numbers[right] < target) left++;
            else right--;
        }

        return arr;
    }
}

public class TwoSumII {

    public static void main(String[] args) {

        Solution01 s1 = new Solution01();

        System.out.println(Arrays.toString(s1.twoSum(new int[]{-1, 0}, -1)));
    }
}
