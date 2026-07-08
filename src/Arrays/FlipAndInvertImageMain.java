package Arrays;

import java.util.Arrays;

class Solution35 {
    public int[][] flipAndInvertImage(int[][] image) {

        int len = image.length;

        for (int i = 0; i < len; i++) {
            int k = 0, m = len - 1;

            while (k <= m) {

                int temp = image[i][k];

                if (image[i][m] == 0) image[i][k] = 1;
                else image[i][k] = 0;

                if (temp == 0) image[i][m] = 1;
                else image[i][m] = 0;

                k++;
                m--;
            }
        }

        return image;
    }
}

public class FlipAndInvertImageMain {

    public static void main(String[] args) {
        Solution35 S35 = new Solution35();

        int[][] arr = {{1,1,0}, {1,0,1}, {0,0,0}};
        S35.flipAndInvertImage(arr);

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
