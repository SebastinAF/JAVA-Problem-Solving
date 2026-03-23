package GreedySolutions;

import java.util.Arrays;

class Solution01 {
    public int findContentChildren(int[] g, int[] s) {

        int result = 0;
        int i = 0, j = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (i < g.length) {

            while (j < s.length) {
                if (s[j] >= g[i]) {
                    result++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }

        return result;
    }
}

public class FindContentChildrenMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.findContentChildren(new int[]{1,2,3}, new int[]{3}));
    }
}
