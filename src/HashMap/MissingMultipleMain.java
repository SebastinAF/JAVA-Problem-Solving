package HashMap;

import java.util.ArrayList;
import java.util.List;

class Solution08 {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int v : nums) list.add(v);

        for (int i = 1; i <= 10; i++) {
            if (!list.contains(i * k)) return i * k;
        }

        return 0;
    }
}

public class MissingMultipleMain {
    public static void main(String[] args) {
        Solution08 S08 = new Solution08();

        System.out.println(S08.missingMultiple(new int[]{8,2,3,4,6}, 2));
    }
}
