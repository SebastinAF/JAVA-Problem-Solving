package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution12 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String st : strs){

            String frequencyString = getFrequencyString(st);

            if (map.containsKey(frequencyString)){
                map.get(frequencyString).add(st);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(st);
                map.put(frequencyString, newList);
            }
        }
        return new ArrayList<>(map.values());
    }


    public String getFrequencyString(String str){

        int[] freq = new int[26];

        for (char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        char c = 'a';
        for (int v : freq){
            sb.append(c);
            sb.append(v);
            c++;
        }
        return sb.toString();
    }
}

public class GroupAnagramsMain {
    public static void main(String[] args) {
        Solution12 s12 = new Solution12();

        System.out.println(s12.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
