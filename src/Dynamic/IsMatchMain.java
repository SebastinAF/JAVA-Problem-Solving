package Dynamic;

class Solution07 {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] result = new boolean[m + 1][n + 1];
        result[0][0] = true;
        for (int j = 2; j <= n; j++) if (p.charAt(j - 1) == '*') result[0][j] = result[0][j - 2];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '.' || pc == sc) result[i][j] = result[i - 1][j - 1];
                else if (pc == '*') {
                    result[i][j] =result[i][j - 2];

                    char prev = p.charAt(j - 2);
                    if (prev == '.' || prev == sc) result[i][j] = result[i -1][j];
                }
            }
        }

        return result[m][n];
    }
}

public class IsMatchMain {

    public static void main(String[] args) {
        Solution07 S07 = new Solution07();

        System.out.println(S07.isMatch("", "a*"));
    }
}
