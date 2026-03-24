package GreedySolutions;

import java.util.ArrayList;
import java.util.List;

class Solution02 {
    public List<Integer> partitionLabels(String s) {

        int[] lastIndexOfChar = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndexOfChar[s.charAt(i) - 'a'] = i;
        }

        List<Integer> resultList = new ArrayList<>();

        int start  = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndexOfChar[s.charAt(i) - 'a']);

            if (i == end) {
                resultList.add(end - start + 1);
                start = i + 1;
            }
        }

        return resultList;
    }
}

public class PartitionLabelsMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        System.out.println(S02.partitionLabels("ababcbacadefegdehijhklij"));
    }
}
