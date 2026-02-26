package ArraysAndStrings;

import java.util.Arrays;

class Solution05 {
    public void rotate(int[] nums, int k) {

        int l = nums.length;
        k = k % nums.length;

        revers(nums, 0, l - 1);
        revers(nums, 0, k -1);
        revers(nums, k, l - 1);

    }

    public void revers(int[] nums, int i, int j){
        while (i < j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}

public class RotateArrayMain {

    public static void main(String[] args) {
        Solution05 S05 = new Solution05();

        int[] num = {1,2,3,4,5,6,7};

        S05.rotate(num, 3);

        System.out.println(Arrays.toString(num));
    }
}
