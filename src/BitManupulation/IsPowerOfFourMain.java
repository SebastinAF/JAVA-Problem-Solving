package BitManupulation;

class Solution02 {
    public boolean isPowerOfFour(int n) {

        while (n % 4 == 0) n /= 4;

        return n == 1;
    }
}

public class IsPowerOfFourMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        System.out.println(S02.isPowerOfFour(16));
    }
}
