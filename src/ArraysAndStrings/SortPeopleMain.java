package ArraysAndStrings;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

class Solution30 {
    public String[] sortPeople(String[] names, int[] heights) {

        String[] strArray = new String[names.length];
        Map<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < heights.length; i++) {
            treeMap.put(heights[i], names[i]);
        }

        int i = names.length - 1;
        for (int v : treeMap.keySet()) {
            strArray[i] = treeMap.get(v);
            i--;
        }

        return strArray;
    }
}

public class SortPeopleMain {

    public static void main(String[] args) {
        Solution30 S30 = new Solution30();

        System.out.println(Arrays.toString(S30.sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})));
    }
}
