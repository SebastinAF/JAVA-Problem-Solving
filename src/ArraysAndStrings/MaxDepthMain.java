package ArraysAndStrings;

class Solution32 {
    public int maxDepth(String s) {

        int result = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                depth++;
                if (depth > result) result = depth;
            } else if (ch == ')') {
                depth--;
            }

        }

        return result;
    }
}

public class MaxDepthMain {

    public static void main(String[] args) {
        Solution32 S32 = new Solution32();

        System.out.println(S32.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
