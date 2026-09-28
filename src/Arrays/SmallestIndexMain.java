package Arrays;

class Solution58 {
    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int s = nums[i];
            while (s > 0) {
                sum += s % 10;
                s /= 10;
            }
            if (sum == i) return i;
        }

        return -1;
    }
}

public class SmallestIndexMain {

    public static void main(String[] args) {
        Solution58 S58 = new Solution58();

        System.out.println(S58.smallestIndex(new int[]{1,3,2}));
    }
}
