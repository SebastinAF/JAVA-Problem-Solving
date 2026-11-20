package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution68 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
        int l = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < l - 1; i++) {
            if (min > arr[i + 1] - arr[i]) min = arr[i +1] - arr[i];
        }

        for (int i = 0; i < l - 1; i++) {
            List<Integer> ls = new ArrayList<>();
            if (min == arr[i+1] - arr[i]) {
                ls.add(arr[i]);
                ls.add(arr[i + 1]);
            }

            if (!ls.isEmpty()) list.add(ls);
        }

        return list;
    }
}

public class MinimumAbsDifferenceMain {

    public static void main(String[] args) {
        Solution68 S68 = new Solution68();

        System.out.println(S68.minimumAbsDifference(new int[]{1,3,6,10,15}));
    }

}
