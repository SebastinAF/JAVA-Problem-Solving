package ArrasAndStrings;

class Solution02 {
    public int removeElement(int[] nums, int val) {
        int count = 0;

        for(int i : nums) {
            if (val != i) {
                nums[count++] = i;
            }
        }
        return count;
    }
}

public class RemoveElementMain {

    public static void main(String[] args) {
        Solution02 s02 = new Solution02();

        System.out.println(s02.removeElement(new int[]{3,2,2,3}, 3));
    }
}
