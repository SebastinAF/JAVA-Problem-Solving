package ArraysAndStrings;

class Solution15 {
    public boolean judgeCircle(String moves) {

        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') x++;
            else if (moves.charAt(i) == 'L') y++;
            else if (moves.charAt(i) == 'D') x--;
            else if (moves.charAt(i) == 'R') y--;
        }

        return x == 0 && y == 0;
    }
}

public class JudgeCircleMain {

    public static void main(String[] args) {
        Solution15 S15 = new Solution15();

        System.out.println(S15.judgeCircle("UD"));
    }
}
