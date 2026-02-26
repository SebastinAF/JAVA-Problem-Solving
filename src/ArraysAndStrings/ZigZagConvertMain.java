package ArraysAndStrings;

class Solution27 {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows)
            return s;

        StringBuilder[] sbArray = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sbArray[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char ch : s.toCharArray()) {

            sbArray[currentRow].append(ch);

            if (currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder sb : sbArray)
            result.append(sb);

        return result.toString();
    }
}

public class ZigZagConvertMain {

    public static void main(String[] args) {
        Solution27 S27 = new Solution27();

        System.out.println(S27.convert("PAYPALISHIRING", 3));
    }
}
