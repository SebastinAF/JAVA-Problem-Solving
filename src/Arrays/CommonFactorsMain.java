package Arrays;

class Solution56 {
    public int commonFactors(int a, int b) {
        int result = 0;
        for (int i = 1; i <= Math.min(a, b); i++) if (a % i == 0 && b % i == 0) result++;
        return result;
    }
}


public class CommonFactorsMain {

    public static void main(String[] args) {
        Solution56 S56 = new Solution56();

        System.out.println(S56.commonFactors(12, 6));
    }
}
