package Arrays;

class Solution66 {
    public int sortPermutation(int[] nums) {

        int n = nums.length;;
        int k = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) k &= nums[i];
        }

        return k == -1 ? 0 : k;
    }
}

public class SortPermutationMain {

    public static void main(String[] args) {
        Solution66 S66 = new Solution66();

        System.out.println(S66.sortPermutation(new int[]{0,3,2,1}));
    }
}
