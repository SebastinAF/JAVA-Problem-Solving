package Arrays;

class Solution59 {
    public boolean uniformArray(int[] nums1) {

        boolean odd = false;
        boolean even = false;

        for (int num : nums1) {
            if (num % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
        }

        return !(odd && even) || nums1.length > 1;

//        Simple
//        return true;
    }
}

public class UniformArrayMain {
    public static void main(String[] args) {
        Solution59 S59 = new Solution59();

        System.out.println(S59.uniformArray(new int[]{2,3}));
    }
}
