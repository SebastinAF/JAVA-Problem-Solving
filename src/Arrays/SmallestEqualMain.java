package Arrays;

class Solution49 {
    public int smallestEqual(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if (i % 10 == nums[i]) {
                min = Math.min(min, i);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

public class SmallestEqualMain {

    public static void main(String[] args) {
        Solution49 S49 = new Solution49();
        System.out.println(S49.smallestEqual(new int[]{4,3,2,1}));
    }
}
