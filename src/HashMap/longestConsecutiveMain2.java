package HashMap;

import java.util.HashSet;
import java.util.Set;

class Solution131 {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int longest = 0;

        for (int v : set){
            if (!set.contains(v - 1)){
                int value = v;
                int streak = 1;

                while (set.contains(value + 1)){
                    streak++;
                    value++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }
}

public class longestConsecutiveMain2 {

    public static void main(String[] args) {

        Solution131 s131 = new Solution131();
        System.out.println(s131.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));

    }
}
