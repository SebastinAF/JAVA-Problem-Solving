package Arrays;

import java.util.ArrayList;
import java.util.Collections;

class Solution16 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int val : nums1) arrayList.add(val);
        for (int val : nums2) arrayList.add(val);

        Collections.sort(arrayList);

        int median = arrayList.size() / 2;

        if (arrayList.size() % 2 == 0) {
            return (arrayList.get(median - 1) + arrayList.get(median)) / 2.0;
        } else {
            return arrayList.get(median);
        }
    }
}

public class FindMedianSortedArraysMain {

    public static void main(String[] args) {
        Solution16 S16 = new Solution16();

        System.out.println(S16.findMedianSortedArrays(new int[]{1,2}, new  int[]{3,4}));
    }
}
