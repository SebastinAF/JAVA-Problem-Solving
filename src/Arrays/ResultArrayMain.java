package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

class Solution111 {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (list1.getLast() > list2.getLast()) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }

        list1.addAll(list2);
        int[] result = new int[nums.length];
        int i = 0;
        for (int v : list1)
            result[i++] = v;

        return result;
    }
}

public class ResultArrayMain {

    public static void main(String[] args) {
        Solution111 S111 = new Solution111();

        int[] result = S111.resultArray(new int[]{1,2,14,15});

        System.out.println(Arrays.toString(result));
    }
}

