package ArraysAndStrings;

class Solution45 {
    public String digitSum(String s, int k) {

        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > k) {
            String str = sb.toString();
            sb = new StringBuilder();
            int x = 0;
            int stLen = str.length();
            for (int i = 0; i < stLen; i++) {
                int y = 0;
                int j = 0;
                for ( ; j < k; j++) {
                    if (x < stLen) y += str.charAt(x++) - 48;
                    else break;
                }
                sb.append(y);
                if (x == stLen) break;
            }
        }


        return sb.toString();
    }
}

public class DigitSumMain {
    public static void main(String[] args) {
        Solution45 S45 = new Solution45();

        System.out.println(Integer.parseInt(S45.digitSum("00000000", 3)));
    }
}
