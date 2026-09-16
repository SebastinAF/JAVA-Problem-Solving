package ArraysAndStrings;

class Solution29 {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            int windowLength = right - left + 1;
            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }
}

public class CharacterReplacementMain {

    public static void main(String[] args) {
        Solution29 S29 = new Solution29();

        System.out.println(S29.characterReplacement("ABAB", 2));
    }
}
