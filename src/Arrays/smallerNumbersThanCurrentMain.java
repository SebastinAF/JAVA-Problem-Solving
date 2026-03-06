package Arrays;

class Solution1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i] > nums[j])
                    count++;
            }
            arr[i] = count;
        }

        return arr;
    }
}

public class smallerNumbersThanCurrentMain {

    public static void main(String[] args) {

        Solution1 s1 = new Solution1();
        int[] vals = s1.smallerNumbersThanCurrent(new int[]{6,5,4,8});

        for (int val : vals)
            System.out.println(val);

    }

}
