package Arrays;

import java.util.ArrayList;
import java.util.List;

class Solution08 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean distinct = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    distinct = true;
                }
            }
            if (!distinct && !list.contains(nums1[i])) {
                list.add(nums1[i]);
            }
        }
        answer.add(list);

        List<Integer> list2 = new ArrayList<>();

        for (int j = 0; j < nums2.length; j++) {
            boolean distinct = false;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums2[j]) {
                    distinct = true;
                }
            }
            if (!distinct && !list2.contains(nums2[j])) {
                list2.add(nums2[j]);
            }
        }

        answer.add(list2);

        return answer;
    }
}


public class FindDifferenceMainBrut {

    public static void main(String[] args) {
        Solution08 S08 = new Solution08();

        System.out.println(S08.findDifference(new int[]{-73}, new int[]{-66,9,-54,-32,94,11}));
    }
}
