package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

class Solution18 {
    public char findTheDifference(String s, String t) {

        Map<Character,Integer> sMap = new HashMap<>();
        Map<Character,Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        for (char c : t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);

        for (int i = 0; i < t.length(); i++) {
            if (tMap.get(t.charAt(i)) != sMap.get(t.charAt(i))) return t.charAt(i);
        }

//        int[] arr = new int[26];
//
//        for (char c : s.toCharArray()) arr[c - 'a']++;
//        for (char c : t.toCharArray()) {
//            arr[c - 'a']--;
//            if (arr[c - 'a'] < 0) return c;
//        }
        return ' ';
    }
}

public class FindTheDifferenceMain {

    public static void main(String[] args) {
        Solution18 S18 = new Solution18();

        System.out.println(S18.findTheDifference("", "y"));
    }

}
