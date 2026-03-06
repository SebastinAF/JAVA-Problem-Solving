package Arrays;

import java.util.ArrayList;

class Solution06 {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] freq = new int[1001];

        for (int num : nums1)
            freq[num]++;

        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums2) {
            if (freq[num] > 0) {
                al.add(num);
                freq[num]--;
            }
        }

        int[] result = new int[al.size()];
        int i = 0;
        for (int values : al) {
            result[i++] = values;
        }
        return result;
    }
}

public class IntersectionIIMain {

    public static void main(String[] args) {
        Solution06 S06 = new Solution06();

        for (int val : S06.intersect(new int[]{1,2,2,1}, new int[]{2,2})) {
            System.out.println(val);
        }
    }
}
