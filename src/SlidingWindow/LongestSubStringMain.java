package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

class Solution02 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int substringLength = 1;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            if (substringLength < set.size())
                substringLength = set.size();
        }

        return substringLength;
    }
}

public class LongestSubStringMain {
    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        System.out.println(S02.lengthOfLongestSubstring("pwwkewxpw"));
    }
}
