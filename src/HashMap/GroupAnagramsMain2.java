package HashMap;

import java.util.*;

class Solution121 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> frequencyMap = new HashMap<>();

        for (String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String fst = new String(ch);

            if(frequencyMap.containsKey(fst)){
                frequencyMap.get(fst).add(str);
            } else {
                List<String> nst = new ArrayList<>();
                nst.add(str);
                frequencyMap.put(fst, nst);
            }
        }

        return new ArrayList<>(frequencyMap.values());
    }
}

public class GroupAnagramsMain2 {

    public static void main(String[] args) {
        Solution121 s121 = new Solution121();

        System.out.println(s121.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
