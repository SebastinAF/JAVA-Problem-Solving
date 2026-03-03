package Matrix;

import java.util.HashSet;
import java.util.Set;

class Solution01 {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];

                if (number != '.') {
                    if (!set.add(number + " in row " + i) || !set.add(number + " in column " + j)
                            || !set.add(number + " in box " + i/3 + " - " + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}

public class IsValidSudokuMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.isValidSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        }));
    }

}
