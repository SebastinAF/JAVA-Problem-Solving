package Arrays;

class Solution30 {
    public int arrangeCoins(int n) {

        int i = 1, count = 0;

        while (n >= i) {
            n -= i;
            count++;
            i++;
        }

        return count;
    }
}

public class ArrangeCoinsMain {

    public static void main(String[] args) {
        Solution30 S30 = new Solution30();

        System.out.println(S30.arrangeCoins(5));
    }
}
