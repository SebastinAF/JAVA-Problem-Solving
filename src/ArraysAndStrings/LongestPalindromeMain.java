package ArraysAndStrings;

class Solution09 {
    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length();i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            int length = Math.max(len1, len2);

            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

public class LongestPalindromeMain {
    public static void main(String[] args) {
        Solution09 S09 = new Solution09();

        System.out.println(S09.longestPalindrome("babad"));
    }
}
