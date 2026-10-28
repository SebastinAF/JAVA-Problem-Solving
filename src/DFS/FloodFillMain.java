package DFS;

class Solution01 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int OColor = image[sr][sc];

        if (OColor == color) return image;

        dfs(image, sr, sc, OColor, color);

        return image;
    }

    public void dfs(int[][] image, int r, int c, int OColor, int color) {
        int m = image.length;
        int n = image[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n || image[r][c] != OColor) return;

        image[r][c] = color;

        dfs(image, r - 1, c, OColor, color);//up
        dfs(image, r + 1, c, OColor, color);//Down
        dfs(image, r, c - 1, OColor, color);//Left
        dfs(image, r, c + 1, OColor, color);//right
    }
}

public class FloodFillMain {
    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        int[][] image = { {1,1,1},
                {1,1,0}, {1,0,1}
        };

        S01.floodFill(image, 1, 1, 2);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
