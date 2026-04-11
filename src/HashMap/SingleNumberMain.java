package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution07 {
    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int n : nums) {
//            if (!map.containsKey(n)) {
//                map.put(n, 1);
//            } else {
//                map.put(n, map.get(n) + 1);
//            }
//        }
//
//        for (int n : nums) {
//            if (map.get(n) == 1) return n;
//        }

        Set<Integer> set = new HashSet<>();

        for (int a : nums) {
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }

        return set.iterator().next();
    }
}

public class SingleNumberMain {

    public static void main(String[] args) {
        Solution07 S07 = new Solution07();

        System.out.println(S07.singleNumber(new int[]{4,1,2,1,2}));
    }
}
