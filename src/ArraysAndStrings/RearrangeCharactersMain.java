package ArraysAndStrings;

class Solution19 {
    public int rearrangeCharacters(String s, String target) {

        char[] sFreq = new char[26];
        char[] tFreq = new char[26];

        for (char a : s.toCharArray()) sFreq[a - 'a']++;
        for (char a : target.toCharArray()) tFreq[a - 'a']++;

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            if (tFreq[i] > 0) result = Math.min(result, sFreq[i] / tFreq[i]);
        }

        return result;
    }
}

public class RearrangeCharactersMain {

    public static void main(String[] args) {
        Solution19 S19 = new Solution19();

        System.out.println(S19.rearrangeCharacters("ilovecodingonleetcode", "code"));
    }
}
