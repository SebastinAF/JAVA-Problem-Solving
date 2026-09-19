package Arrays;

import java.util.Arrays;

class Solution53 {
//    public int[] sortArray(int[] nums) {

    // double selection sort method
//        int i = 0;
//        int j = nums.length - 1;
//
//        while (i < j) {
//
//            int minIndex = i, maxIndex = i;
//            int k = i + 1;
//
//            while (k <= j) {
//                if (nums[minIndex] > nums[k]) {
//                    minIndex = k;
//                }
//
//                if (nums[maxIndex] < nums[k]) {
//                    maxIndex = k;
//                }
//
//                k++;
//            }
//
//            int temp1 = nums[i];
//            nums[i] = nums[minIndex];
//            nums[minIndex] = temp1;
//
//            if (maxIndex == i) maxIndex = minIndex;
//
//            int temp2 = nums[j];
//            nums[j] = nums[maxIndex];
//            nums[maxIndex] = temp2;
//
//            i++;
//            j--;
//        }


    // single selection sort
//        for (int i = 0; i < nums.length - 1; i++) {
//            int min = nums[i];
//            int j = i + 1, index = j;
//            while (j < nums.length) {
//                if (min > nums[j]) {
//                    min = nums[j];
//                    index = j;
//                }
//                j++;
//            }
//
//            if (min != nums[i]) {
//                int temp = nums[i];
//                nums[i] = nums[index];
//                nums[index] = temp;
//            }
//        }

//        return nums;
//    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }

}

public class SortArrayMain {

    public static void main(String[] args) {
        Solution53 S53 = new Solution53();

        System.out.println(Arrays.toString(S53.sortArray(new int[]{5,1,1,2,0,0})));
    }
}
