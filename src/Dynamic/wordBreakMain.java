package Dynamic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution02 {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        boolean[] b = new boolean[s.length() + 1];
        b[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (b[j] && set.contains(s.substring(j, i))) {
                    b[i] = true;
                    break;
                }
            }
        }

        return b[s.length()];
    }
}

public class wordBreakMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();
        List<String> list = Arrays.asList("leet", "code");

        System.out.println(S02.wordBreak("leetcode", list));
    }
}
