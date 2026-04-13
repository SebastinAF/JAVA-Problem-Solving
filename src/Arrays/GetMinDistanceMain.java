package Arrays;

class Solution24 {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int v = 0;
            if (nums[i] == target) {
                v = Math.abs( i - start);
                min = Math.min(min, v);
            }
        }

        return min;
    }
}

public class GetMinDistanceMain {

    public static void main(String[] args) {
        Solution24 S24 = new Solution24();

        System.out.println(S24.getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1}, 1, 0));
    }
}
