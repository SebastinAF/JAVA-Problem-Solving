package Arrays;

import java.util.Arrays;

class Solution37 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortedArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);

        for(int i = 0; i < heights.length; i++) if(sortedArray[i] != heights[i]) count++;

        return count;
    }
}

public class HeightCheckerMain {

    public static void main(String[] args) {
        Solution37 S37 = new Solution37();

        System.out.println(S37.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
