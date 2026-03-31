package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

class Solution14 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) return result;

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTrack(result, digits, map, 0, new StringBuilder());
        return result;
    }

    public void backTrack(List<String> result, String digits, String[] map, int index, StringBuilder current) {

        //recursion Base Case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            current.append(c);
            backTrack(result, digits, map, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}

public class LetterCombinationsMain {

    public static void main(String[] args) {
        Solution14 S14 = new Solution14();

        System.out.println(S14.letterCombinations("23"));
    }
}
