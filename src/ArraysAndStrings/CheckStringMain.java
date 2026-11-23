package ArraysAndStrings;

class Solution46 {
    public boolean checkString(String s) {

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') found = true;
            else if (found) return false;
        }

        return true;
    }
}

public class CheckStringMain {

    public static void main(String[] args) {
        Solution46 S46 = new Solution46();

        System.out.println(S46.checkString("aabab"));
    }
}
