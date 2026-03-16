package Arrays;

class Solution17 {
    public int reverse(int x) {

        int result = 0;
        while (x != 0) {

            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) return 0;

            result = result * 10 + (x % 10);
            x /= 10;
        }
        return result;
    }
}

public class ReverseMain {

    public static void main(String[] args) {
        Solution17 S17 = new Solution17();

        System.out.println(S17.reverse(1534236469));
    }
}
