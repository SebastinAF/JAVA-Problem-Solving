package Arrays;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> priorityQueue;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>();

        for (int num : nums) add(num);
    }

    public int add(int val) {
        priorityQueue.offer(val);

        if (priorityQueue.size() > k) priorityQueue.poll();

        return priorityQueue.peek();
    }
}

public class KthLargestMain {

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});

        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }
}
