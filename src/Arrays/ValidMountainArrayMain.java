package Arrays;

class Solution19 {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;
        int i = 0;

        while (i + 1 < n && arr[i] < arr[i + 1]) i++;

        if (i == 0 || i == n - 1) return false;

        while (i + 1 < n && arr[i] > arr[i + 1]) i++;

        return i == n -1;
    }
}

public class ValidMountainArrayMain {
    public static void main(String[] args) {
        Solution19 S19 = new Solution19();

        System.out.println(S19.validMountainArray(new int[]{0,3,2,1}));
    }
}
