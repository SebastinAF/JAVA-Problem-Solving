package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

class Solution04 {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) need.put(c, need.getOrDefault(c, 0) + 1);

        int required = need.size();
        int formed = 0;

        int left = 0;

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && need.get(ch).intValue() == window.get(ch).intValue()) formed++;

            while (formed == required) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char remove = s.charAt(left);
                window.put(remove, window.get(remove) - 1);

                if (need.containsKey(remove) && window.get(remove) < need.get(remove)) formed--;

                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}

public class MinWindowMain {

    public static void main(String[] args) {
        Solution04 S04 = new Solution04();

        System.out.println(S04.minWindow("ADOBECODEBANC", "ABC"));
    }
}
