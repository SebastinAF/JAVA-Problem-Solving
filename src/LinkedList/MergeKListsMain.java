package LinkedList;

import java.util.*;

class ListNode6 {
    int val;
    ListNode6 next;
    ListNode6() {}
    ListNode6(int val) { this.val = val; }
    ListNode6(int val, ListNode6 next) { this.val = val; this.next = next; }
}

class Solution06 {
    public ListNode6 mergeKLists(ListNode6[] lists) {
        ListNode6 head = null, newNode = null;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode6 temp = lists[i];
            while (temp != null) {
                list.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(list);
        ListNode6 node;

        for (int i = 0; i < list.size(); i++) {
            if (head == null) {
                head = newNode = new ListNode6(list.get(i));
            } else {
                node = new ListNode6(list.get(i));
                newNode.next = node;
                newNode = node;
            }
        }

        return head;
    }
}

public class MergeKListsMain {

    public static void main(String[] args) {
        int[][] arr = {{1,4,5}, {1,3,4}, {2,6}};
        ListNode6[] heads = new ListNode6[arr.length];
        ListNode6 headNode = null, newNode = null;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (headNode == null) {
                    headNode = newNode = heads[i] = new ListNode6(arr[i][j]);
                } else {
                    ListNode6 node = new ListNode6(arr[i][j]);
                    newNode.next = node;
                    newNode = node;
                }
            }
            headNode = null;
        }

        Solution06 S06 = new Solution06();
        ListNode6 result = S06.mergeKLists(heads);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
