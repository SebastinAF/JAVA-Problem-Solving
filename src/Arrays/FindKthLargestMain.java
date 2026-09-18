package Arrays;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution52 {
    public int findKthLargest(int[] nums, int k) {

        //Simple Way using build in function.
//        Arrays.sort(nums);
//        return nums[nums.length - k];

        Queue<Integer> queue = new PriorityQueue<>();

        for (int v : nums) {
            queue.add(v);

            if (queue.size() > k) queue.poll();
        }

        return queue.peek();
    }
}

public class FindKthLargestMain {

    public static void main(String[] args) {
        Solution52 S52 = new Solution52();

        System.out.println(S52.findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}
