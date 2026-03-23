package HashMap;

import java.util.HashMap;

class Solution11 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++){

            if (hm.containsKey(nums[i]) && (i - (hm.get(nums[i])) <= k)){
                return true;
            }

            hm.put(nums[i], i);

        }

        return false;
    }
}

public class ContainsNearbyDuplicateMain {

    public static void main(String[] args) {

        Solution11 s11 = new Solution11();

        System.out.println(s11.containsNearbyDuplicate( new int[]{1,2,3,1,2,3}, 3));
    }
}
