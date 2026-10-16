package Arrays;

import java.util.*;

class Solution63 {
    public int thirdMax(int[] nums) {

//        Arrays.sort(nums);
//        List<Integer> list = new ArrayList<>();
//
//        for (int i : nums) {
//            if (!list.contains(i)) list.add(i);
//        }
//        if (list.size() < 3) return list.getLast();
//        return list.get(list.size() - 3);

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int n : nums) {
            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second && n != first) {
                third = second;
                second = n;
            } else if (n > third && n != second && n != first) third = n;
        }

        return third != Long.MIN_VALUE ? (int) third : (int) first;
    }
}

public class ThirdMaxMain {

    public static void main(String[] args) {
        Solution63 S63 = new Solution63();

        System.out.println(S63.thirdMax(new int[]{3,2,1}));
    }
}
