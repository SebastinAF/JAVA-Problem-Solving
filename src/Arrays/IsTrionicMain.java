package Arrays;

class Solution21 {
    public boolean isTrionic(int[] nums) {

        if (!(nums[0] < nums[1])) return false;

        int i = 0;
        int count = 0;

        while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

        while (i < nums.length - 1 && nums[i] > nums[i + 1]) {
            if (nums[i - 1] < nums[i]) count++;
            i++;
        }

        while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
            if (nums[i - 1] > nums[i]) count++;
            i++;
        }

        return count == 2;
    }
}

public class IsTrionicMain {
    public static void main(String[] args) {

        Solution21 S21 = new Solution21();

        System.out.println(S21.isTrionic(new int[]{2,1,3}));
    }
}
