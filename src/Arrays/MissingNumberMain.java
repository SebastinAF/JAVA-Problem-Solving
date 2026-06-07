package Arrays;

import java.util.Arrays;

class Solution32 {
    public int missingNumber(int[] nums) {

       /** Arrays.sort(nums);
        int resultVal = 0;

        for (int v : nums) {
            if (v != resultVal) {
                return resultVal;
            }
            resultVal++;
        }

        return resultVal;  **/

        int sum = 0;

        for (int num : nums) sum += num;

        return (nums.length * (nums.length + 1)) / 2 - sum;
    }
}

public class MissingNumberMain {
    public static void main(String[] args) {

        Solution32 S32 = new Solution32();

        System.out.println(S32.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
