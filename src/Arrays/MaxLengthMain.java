package Arrays;

class Solution70 {
    public int maxLength(int[] nums) {

        int n = nums.length;
        int maxLength = 0;

        for (int i = 0;i < n; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                gcd = gcd(gcd, nums[j]);
                lcm = (lcm / gcd(lcm, nums[j])) * nums[j];

                if (product == gcd * lcm) maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

    public long gcd(long a, long b) {

        if (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}

public class MaxLengthMain {

    public static void main(String[] args) {
        Solution70 S70 = new Solution70();

        System.out.println(S70.maxLength(new int[]{1,2,1,2,1,1,1}));
    }
}
