package Arrays;

import java.util.Arrays;

class Solution14 {
    public int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = nums[i];
            } else {
                int value = ((i + nums[i]) % nums.length + nums.length) % nums.length;
                result[i] = nums[value];
            }
        }
        return result;
    }
}

public class ConstructTransformedArrayMain {

    public static void main(String[] args) {

        Solution14 S14 = new Solution14();

        int[] answer = S14.constructTransformedArray(new int[]{3,-2,1,1});
        System.out.println(Arrays.toString(answer));
    }
}
