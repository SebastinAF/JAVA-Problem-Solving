package Arrays;

import java.util.Arrays;

class Solution44 {
    public int[] replaceElements(int[] arr) {

        if (arr.length <= 1) return new int[]{-1};

        for (int i = 1; i < arr.length; i++) {
            int v = arr[i];
            int l = i;
            int r = arr.length - 1;
            while (l <= r) {
                if (Math.max(arr[l], arr[r]) > v) v = Math.max(arr[l], arr[r]);
                l++;
                r--;
            }
            arr[i - 1] = v;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }
}

public class ReplaceElementsMain {

    public static void main(String[] args) {
        Solution44 S44 = new Solution44();

        System.out.println(Arrays.toString(S44.replaceElements(new int[]{17,18,5,4,6,1})));
    }
}
