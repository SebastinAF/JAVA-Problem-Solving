package ArrasAndStrings;

class Solution03 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            //Finding the unique numbers and taking count.
            if(nums[i] != nums[k]){
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }
}

public class RemoveDuplicatesMain {

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        System.out.println(S03.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
