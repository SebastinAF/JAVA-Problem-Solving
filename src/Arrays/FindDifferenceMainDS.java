package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution0801 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int val : nums1) set1.add(val);
        for (int val : nums2) set2.add(val);

        List<Integer> list = new ArrayList<>();
        for (int i : set1) if (!set2.contains(i)) list.add(i);
        answer.add(list);

        List<Integer> list2 = new ArrayList<>();
        for (int i : set2) if (!list2.contains(i))  list2.add(i);
        answer.add(list2);

        return answer;
    }
}


public class FindDifferenceMainDS {

    public static void main(String[] args) {
        Solution0801 S0801 = new Solution0801();

        System.out.println(S0801.findDifference(new int[]{-73}, new int[]{-66,9,-54,-32,94,11}));
    }
}
