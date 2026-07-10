package ArraysAndStrings;

class Solution22 {
    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s, left + 1, right)
                        || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

public class ValidPalindromeMain {

    public static void main(String[] args) {
        Solution22 S22 = new Solution22();

        System.out.println(S22.validPalindrome("abca"));
    }
}
