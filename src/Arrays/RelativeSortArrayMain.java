package Arrays;

import java.util.*;

class Solution20 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) map.put(num, map.getOrDefault(num, 0) + 1);

        int i = 0;
        int[] result = new int[arr1.length];

        for (int num : arr2) {
            int count = map.get(num);
            while (count-- > 0) {
                result[i++] = num;
            }
            map.remove(num);
        }

        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) {
            int count = map.get(key);
            while (count-- > 0) list.add(key);
        }

        Collections.sort(list);

        for (int val : list) result[i++] = val;

        return result;
    }
}

public class RelativeSortArrayMain {

    public static void main(String[] args) {
        Solution20 S20 = new Solution20();

        int[] result = S20.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});

        System.out.println(Arrays.toString(result));
    }
}
