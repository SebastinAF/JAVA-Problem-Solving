package TwoPointers;

class Solution02 {
    public int maxArea(int[] height) {

        int result = 0;
        int i = 0, j = height.length - 1;

        while (i < j) {

            int area = (j - i) * Math.min(height[i], height[j]);

            if (result < area)
                result = area;

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}

public class MaxAreaMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        System.out.println(S02.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
