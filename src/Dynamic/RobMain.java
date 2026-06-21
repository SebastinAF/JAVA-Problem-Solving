package Dynamic;

class Solution04 {
    public int rob(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int[] arr = new int[nums.length];
        arr[nums.length - 1] = nums[nums.length - 1];
        arr[nums.length - 2] = Math.max(nums[nums.length - 1], nums[nums.length - 2]);

        for (int i = nums.length - 3; i >= 0; i--) {
            arr[i] = Math.max(nums[i] + arr[i + 2], arr[i + 1]);
        }
        return arr[0];
    }
}

public class RobMain {

    public static void main(String[] args) {
        Solution04 S04 = new Solution04();
        System.out.println(S04.rob(new int[]{2,7,9,3,1}));
    }
}
