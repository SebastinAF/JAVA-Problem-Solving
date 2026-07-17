package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution40 {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (resultMap.containsKey(arr[i])) {
                resultMap.put(arr[i], resultMap.get(arr[i]) + 1);
            } else {
                resultMap.put(arr[i], 1);
            }
        }

        Set<Integer> resultSet = new HashSet<>();

        for (int v : resultMap.values()) {
            if (resultSet.contains(v)) return false;
            else resultSet.add(v);
        }

        return true;
    }
}

public class UniqueOccurrencesMain {

    public static void main(String[] args) {
        Solution40 S40 = new Solution40();

        System.out.println(S40.uniqueOccurrences(new int[]{1,2,2,1,3}));
    }
}
