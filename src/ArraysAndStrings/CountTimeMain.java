package ArraysAndStrings;

class Solution31 {
    public int countTime(String time) {

        int result = 1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?') result = 24;
        else if (time.charAt(0) == '?') {
            if (time.charAt(1) > '3') result = 2;
            else result = 3;
        } else if (time.charAt(1) == '?') {
            if (time.charAt(0) == '2') result *= 4;
            else result *= 10;
        }

        if (time.charAt(3) == '?') result *= 6;
        if (time.charAt(4) == '?') result *= 10;

        return result;
    }
}

public class CountTimeMain {
    public static void main(String[] args) {
        Solution31 S31 = new Solution31();

        System.out.println(S31.countTime("??:??"));
    }
}
