package ArraysAndStrings;

class Solution12 {
    public boolean canBeEqual(String s1, String s2) {
        int[] chars = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                chars[s1.charAt(i) - 'a']++;
            }
        }

        int[] chars2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 != 0) {
                chars2[s1.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (i % 2 == 0) {
                chars[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (i % 2 != 0) {
                chars2[s2.charAt(i) - 'a']--;
            }
        }

        for (int v : chars) if (v != 0) return false;
        for (int v : chars2) if (v != 0) return false;

        return true;
    }
}

public class CanBeEqualMain {

    public static void main(String[] args) {
        Solution12 S12 = new Solution12();

        System.out.println(S12.canBeEqual("abcd", "cdab"));
    }
}
