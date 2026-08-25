package BitManupulation;

class Solution04 {
    public boolean isPerfectSquare(int num) {

        if (num == 1) return true;
        int left = 1;
        int right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int squ = mid * mid;

            if (squ == num) return true;

            if (squ > num) right = mid - 1;
            else left = mid + 1;
        }

        return false;
    }
}

public class IsPerfectSquareMain {

    public static void main(String[] args) {
        Solution04 S04 = new Solution04();

        System.out.println(S04.isPerfectSquare(63));
    }
}
