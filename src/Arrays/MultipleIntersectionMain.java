package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution07 {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();

        int[] freq = new int[1001];

        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();

            for (int num : nums[i]) {
                if (!set.contains(num)) {
                    freq[num]++;
                    set.add(num);
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == nums.length)
                list.add(i);
        }

        return list;
    }
}

public class MultipleIntersectionMain {

    public static void main(String[] args) {

        Solution07 S07 = new Solution07();
        System.out.println(S07.intersection(new int[][]{
                {3,1,2,4,5},
                {1,2,3,4},
                {3,4,5,6}
        }));

    }
}
