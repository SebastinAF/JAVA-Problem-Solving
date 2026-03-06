package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        int a = 19;
        a = 10;

        String s = "sebastin";
        s = "nishanth";

        System.out.println(s);

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 1; i < nums[0]; i++) {
            list.add(i);
        }

        for (int i = 1; i < nums.length; i++){
            if (nums[i] - nums[i - 1] > 1){
                int v = nums[i - 1];
                for (int j = nums[i - 1]; j < nums[i] - 1; j++){
                    list.add(v + 1);
                    v++;
                }
            }
        }

        for (int i = nums[n - 1] + 1; i <= n; i++) {
            list.add(i);
        }

        return list;
    }
}

public class findDisappearedNumbersMain {

    public static void main(String[] args) {

        Solution2 s2 = new Solution2();

        System.out.println(s2.findDisappearedNumbers(new int[]{1,1}));
    }
}
