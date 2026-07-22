package Arrays;

class Solution42 {
    public int search(int[] nums, int target) {

        int length = nums.length - 1;
        int start = 0;

        while (start <= length) {
            int mid = start + (length - start) / 2;

            if (nums[mid] == target) return mid;

            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid] ) length = mid - 1;
                else start = mid + 1;
            } else {
                if (target <= nums[mid] && target > nums[length]) start = mid + 1;
                else length = mid - 1;
            }
        }

        return 0;
    }
}

public class SearchMain {

    public static void main(String[] args) {
        Solution42 S42 = new Solution42();

        System.out.println(S42.search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
