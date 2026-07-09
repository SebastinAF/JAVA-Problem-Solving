package Arrays;

class Solution36 {
    public int numIdenticalPairs(int[] nums) {

        int resultCount = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) resultCount++;
            }
        }

        return resultCount;
    }
}

public class NumIdenticalPairsMain {

    public static void main(String[] args) {
        Solution36 S36 = new Solution36();

        System.out.println(S36.numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
