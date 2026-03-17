package Arrays;

class Solution18 {
    public int minPatches(int[] nums, int n) {
        int patchesCount = 0;
        int i = 0;

        long miss = 1;

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                miss += nums[i];
                i++;
            } else {
                miss += miss;
                patchesCount++;
            }
        }

        return patchesCount;
    }
}

public class MinPatchesMain {

    public static void main(String[] args) {
        Solution18 S18 = new Solution18();

        System.out.println(S18.minPatches(new int[]{1,3}, 6));
    }
}
