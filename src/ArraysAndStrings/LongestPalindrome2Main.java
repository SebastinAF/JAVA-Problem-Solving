package ArraysAndStrings;

import java.util.HashMap;

class Solution25 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0 ) + 1);

        int totalLen = 0;
        boolean hasOdd = false;

        for (int val : map.values()) {
            if (val % 2 == 0) totalLen += val;
            else {
                totalLen += val;
                hasOdd = true;
            }
        }

        return hasOdd ? totalLen - 1 : totalLen;
    }
}

public class LongestPalindrome2Main {
    public static void main(String[] args) {

        Solution25 S25 = new Solution25();

        System.out.println(S25.longestPalindrome("abccccdd"));
    }
}
