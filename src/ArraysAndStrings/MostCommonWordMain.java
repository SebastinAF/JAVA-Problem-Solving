package ArraysAndStrings;

import java.util.*;

class Solution20 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] str = paragraph.toLowerCase().split("[ !?',;.]");
        Map<String, Integer> strMap = new HashMap<>();
        List<String> bannedList = new ArrayList<>(Arrays.asList(banned));

        for (String s : str) {
            if (!s.equals("")) strMap.put(s, strMap.getOrDefault(s, 0) + 1);
        }

        String result = "";
        int val = Integer.MIN_VALUE;

        for (String s : strMap.keySet()) {
            if (!bannedList.contains(s)) {
                if (val < strMap.get(s)) {
                    val = strMap.get(s);
                    result = s;
                }
            }
        }

        return result;
    }
}

public class MostCommonWordMain {

    public static void main(String[] args) {
        Solution20 S20 = new Solution20();

        System.out.println(S20.mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }
}
