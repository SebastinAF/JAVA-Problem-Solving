package BackTracking;

import java.util.ArrayList;

class Solution01 {
    public ArrayList<String> ratInMaze(int[][] maze) {

        int arrLength = maze.length;
        ArrayList<String> resultList = new ArrayList<>();
        boolean[][] visitRecord = new boolean[arrLength][arrLength];
        if (maze[0][0] == 1) backTrack(0, 0, maze, "", arrLength, visitRecord, resultList);
        return resultList;
    }

    public void backTrack(int row, int col, int[][] maze, String path, int length, boolean[][] visitRecord, ArrayList<String> resultList){
        if (row == length - 1 && col == length - 1) {
            resultList.add(path);
            return;
        }
        int[][] directions = {{-1, 0, 'U'}, {1, 0, 'D'}, {0, 1, 'R'}, {0, -1, 'L'}};
        visitRecord[row][col] = true;
        for (int[] dir : directions) {
            int nextRow = row + dir[0];
            int nextColumn = col + dir[1];
            char ch = (char) dir[2];

            if (nextRow >= 0 && nextRow < length && nextColumn >= 0 && nextColumn < length && !visitRecord[nextRow][nextColumn] && maze[nextRow][nextColumn] == 1 ) {
                backTrack(nextRow, nextColumn, maze, path + ch, length, visitRecord, resultList);
            }
        }

        visitRecord[row][col] = false;
    }
}

public class RatMazeMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        System.out.println(S01.ratInMaze(new int[][]{{1, 0, 0, 0, 5}, {1, 1, 0, 1, 5}, {1, 1, 0, 0, 5}, {0, 1, 1, 1, 5}}));
    }
}
