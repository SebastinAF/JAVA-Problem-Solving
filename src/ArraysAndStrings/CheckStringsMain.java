package ArraysAndStrings;

class Solution13 {
    public boolean checkStrings(String s1, String s2) {

        int[] even = new int[26];
        int[] odd = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (odd[i] != 0 || even[i] != 0) return false;
        }

        return true;
    }
}

public class CheckStringsMain {

    public static void main(String[] args) {
        Solution13 S13 = new Solution13();

        System.out.println(S13.checkStrings("abcdba", "cabdab"));
    }
}
