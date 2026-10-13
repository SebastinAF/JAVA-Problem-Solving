package Arrays;

import java.util.Arrays;
import java.util.Comparator;

class Solution62 {
    public long maxAlternatingSum(int[] nums) {

//        Integer[] nums2 = Arrays.stream(nums)
//                        .boxed().toArray(Integer[]::new);
//
//        Arrays.sort(nums2, Comparator.comparingInt(Math::abs));
//
//        int  i = 0;
//        int  j = nums2.length - 1;
//        int[] newArr = new int[nums2.length];
//        int k = 0;
//
//        while (i <= j) {
//            newArr[k++] = nums2[j--];
//            if (k < nums2.length) newArr[k++] = nums2[i++];
//        }
//
//        long result = 0;
//        for (int x = 0; x < newArr.length; x++) {
//            if (x % 2 == 0) {
//                result -= newArr[x] * newArr[x];
//            } else {
//                result += newArr[x] * newArr[x];
//            }
//        }
//
//        return Math.abs(result);

        int length = nums.length;
        for (int i = 0; i < length; i++) nums[i] *= nums[i];
        Arrays.sort(nums);

        long result = 0;
        int mid = length / 2;
        int i = 0, j = mid;

        while (i < mid) {
            result -= nums[i];
            result += nums[j];
            i++;
            j++;
        }

        if (length % 2 != 0) {
            result += nums[length - 1];
        }

        return result;
    }
}

public class MaxAlternatingSumMain {

    public static void main(String[] args) {
        Solution62 S62 = new Solution62();

        System.out.println(S62.maxAlternatingSum(new int[]{1,-1,2,-2,3,-3}));
    }
}
