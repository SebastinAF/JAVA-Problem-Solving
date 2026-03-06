package Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] result = new int[2];
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int val : nums)
            freq[val]++;

        for (int i = 1; i <= n; i++){
            if (freq[i] == 2) result[0] = i;
            if (freq[i] == 0) result[1] = i;
        }

        return result;
    }
}

public class findErrorNumsMain {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] result = s.findErrorNums(new int[]{1,2,2,4});

        for (int vals : result)
            System.out.println(vals);
    }
}
