package ArrasAndStrings;

class Solution23 {
    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            if (num >= values[i]) {
                int quotient = num / values[i];
                num %= values[i];

                for (int j = 0; j < quotient; j++) {
                    result.append(intToRomanValue(values[i]));
                }
            }
        }
        return result.toString();
    }

    public String intToRomanValue(int x){
        return switch (x) {
            case 1 -> "I";
            case 4 -> "IV";
            case 5 -> "V";
            case 9 -> "IX";
            case 10 -> "X";
            case 40 -> "XL";
            case 50 -> "L";
            case 90 -> "XC";
            case 100 -> "C";
            case 400 -> "CD";
            case 500 -> "D";
            case 900 -> "CM";
            case 1000 -> "M";
            default -> "";
        };
    }
}

public class IntToRomanMain {

    public static void main(String[] args) {
        Solution23 s23 = new Solution23();

        System.out.println(s23.intToRoman(3749));
    }
}