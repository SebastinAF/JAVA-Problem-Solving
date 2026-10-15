package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution01 {
    public int sumCounts(List<Integer> nums) {

        int length = nums.size();
        int result = 0;

        for (int i = 0; i < length; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < length; j++) {
                set.add(nums.get(j));

                int value = set.size();;
                result += value * value;
            }
        }

        return result;
    }
}

public class SumCountsMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        List<Integer> list = Arrays.asList(1, 2, 1);

        System.out.println(S01.sumCounts(list));
    }
}
