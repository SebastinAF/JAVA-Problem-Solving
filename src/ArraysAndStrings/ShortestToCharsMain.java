package ArraysAndStrings;

import java.util.Arrays;

class Solution24 {
    public int[] shortestToChar(String s, char c) {

        int start = 0, end = s.length();
        int[] result = new int[s.length()];

        for (int i = 0; i < end; i++) {
            int frontCount = 0;
            int backCount = 0;
            boolean frontBool = false, backBool = false;

            for (int j = i; j > start - 1; j--) {
                if (s.charAt(j) == c) {
                    backBool = true;
                    break;
                }
                backCount++;
            }

            for (int j = i; j < end; j++) {
                if (s.charAt(j) == c) {
                    frontBool = true;
                    break;
                }
                frontCount++;
            }

            if (frontBool && backBool) result[i] = Math.min(frontCount, backCount);
            else if (frontBool) result[i] = frontCount;
            else result[i] = backCount;
        }

        return result;
    }
}

public class ShortestToCharsMain {
    public static void main(String[] args) {
        Solution24 S24 = new Solution24();

        System.out.println(Arrays.toString(S24.shortestToChar("baab", 'b')));
    }
}
