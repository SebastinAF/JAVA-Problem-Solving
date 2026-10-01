package ArraysAndStrings;

import java.util.Arrays;

class Solution33 {
    public int[] maxDepthAfterSplit(String seq) {

        int[] result = new int[seq.length()];
        int depth = 0;

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                result[i] = depth % 2;
            } else {
                result[i] = depth % 2;
                depth--;
            }
        }

        return result;
    }
}

public class MaxDepthAfterSplitMain {

    public static void main(String[] args) {
        Solution33 S33 = new Solution33();

        System.out.println(Arrays.toString(S33.maxDepthAfterSplit("()(())()")));
    }
}
