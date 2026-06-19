package Arrays;

import java.util.Arrays;

class Solution34 {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            int sum = 0;

            for (char c : s.toCharArray()) {
                sum += weights[c - 'a'];
            }

            int rem = sum % 26;
            sb.append((char) ('z' - rem));
        }

        return sb.toString();
    }
}

public class MapWordWeightsMain {

    public static void main(String[] args) {
        Solution34 S34 = new Solution34();

        System.out.println(S34.mapWordWeights(new String[]{"abcd","def","xyz"}, new int[]{5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2}));
    }
}
