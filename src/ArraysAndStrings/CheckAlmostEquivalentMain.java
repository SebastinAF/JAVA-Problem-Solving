package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

class Solution26 {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : word1.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : word2.toCharArray()) map2.put(c, map2.getOrDefault(c, 0) + 1);

        for (char c : word1.toCharArray()) {
            if (Math.abs(map.get(c) - map2.getOrDefault(c, 0)) > 3) return false;
        }

        for (char c : word2.toCharArray()) {
            if (Math.abs(map2.get(c) - map.getOrDefault(c, 0)) > 3) return false;
        }

        return true;

        //OrElse we can also go with normal frequency i.e : int[] alp = new int[26];
    }
}

public class CheckAlmostEquivalentMain {

    public static void main(String[] args) {
        Solution26 S26 = new Solution26();

        System.out.println(S26.checkAlmostEquivalent("abcdeef", "abaaacc"));
    }
}
