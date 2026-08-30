package Arrays;

class Solution47 {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for (int n : nums) if (n > 0) pos++;
        else if (n < 0) neg++;
        return Math.max(pos, neg);
    }
}

public class MaximumCountMain {

    public static void main(String[] args) {
        Solution47 S47 = new Solution47();

        System.out.println(S47.maximumCount(new int[]{-2,-1,-1,1,2,3}));
    }
}
