package HashMap;

import java.util.Arrays;

class Solution13 {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int fCount = 1;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++){

            if(nums[i] == nums[i + 1]){
                continue;
            }

            if (nums[i + 1] == nums[i] + 1){
                count++;
            }

            if (nums[i + 1] - nums[i] != 1 || i == nums.length - 2) {
                if (count > fCount){
                    fCount = count;
                }
                count = 1;
            }
        }

        return Math.max(fCount, count);
    }
}

public class longestConsecutiveMain {

    public static void main(String[] args) {

        Solution13 s13 = new Solution13();
        System.out.println(s13.longestConsecutive(new int[]{0,0,-1}));

    }
}
