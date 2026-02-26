package TwoPointers;

import java.util.Arrays;

class Solution01 {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}

public class TwoSumII {

    public static void main(String[] args) {

        Solution01 s1 = new Solution01();

        System.out.println(Arrays.toString(s1.twoSum(new int[]{-1, 0}, -1)));
    }
}
