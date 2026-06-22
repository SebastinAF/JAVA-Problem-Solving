package HashMap;

import java.util.HashMap;
import java.util.Map;

class Solution05 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) map.put(c, map.getOrDefault(c, 0) + 1);

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}

public class ValidAnagramsMain {

    public static void main(String[] args) {
        Solution05 S05 = new Solution05();

        System.out.println(S05.isAnagram("anagram", "nagaram"));
    }
}
