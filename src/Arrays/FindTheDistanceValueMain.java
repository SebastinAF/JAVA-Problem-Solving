package Arrays;

class Solution12 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;

        for (int i : arr1) {
            boolean p = false;
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    p = false;
                    break;
                }
                p = true;
            }
            if (p)
                result++;
        }
        return result;
    }
}

public class FindTheDistanceValueMain {

    public static void main(String[] args) {
        Solution12 S12 = new Solution12();

        System.out.println(S12.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }
}
