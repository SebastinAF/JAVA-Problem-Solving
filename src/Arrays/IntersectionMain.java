package Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution05 {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j])
                    set.add(nums1[i]);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int values : set) {
            result[index] = values;
            index++;
        }

        return result;
    }
}

public class IntersectionMain {

    public static void main(String[] args) {
        Solution05 S05 = new Solution05();
        for (int values : S05.intersection(new int[]{1,2,2,1}, new int[]{2,2})) {
            System.out.println(values);
        }
    }
}
