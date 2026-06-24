package ArraysAndStrings;

class Solution11 {
    public String finalString(String s) {

        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == 'i') {
                str.reverse();
                continue;
            }
            str.append(ch);
        }

        return new String(str);
    }
}

public class FinalStringMain {

    public static void main(String[] args) {
        Solution11 S11 = new Solution11();

        System.out.println(S11.finalString("string"));
    }
}
