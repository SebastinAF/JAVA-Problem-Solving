package LinkedList;

class ListNode4 {
    int val;
    ListNode4 next;
    ListNode4() {}
    ListNode4(int val) { this.val = val; }
    ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}

class Solution4 {
    public ListNode4 swapNodes(ListNode4 head, int k) {

        ListNode4 temp = head;
        int count1 = 1;

        while (count1 < k) {
            temp = temp.next;
            count1++;
        }

        int slow = 1;
        int fast = k + 1;
        ListNode4 temp2 = head;
        int tempCount = 1;

        while (tempCount < fast) {
            temp2 = temp2.next;
            tempCount++;
        }

        while (temp2 != null) {
            temp2 = temp2.next;
            slow++;
        }

        ListNode4 temp3 = head;
        int tempCount2 = 1;

        while (tempCount2 < slow) {
            temp3 = temp3.next;
            tempCount2++;
        }

        int value = temp3.val;
        temp3.val = temp.val;
        temp.val = value;

        return head;
    }
}

public class SwapNodesMain {

    public static void main(String[] args) {

        Solution4 S04 = new Solution4();
        ListNode4 headNode = null, newNode = null;
        int[] a = {1,2,3,4,5};
        int k = 2;

        for (int i : a) {
            if (headNode == null) {
                headNode = newNode = new ListNode4(i);
            } else {
                ListNode4 listNode = new ListNode4(i);
                newNode.next = listNode;
                newNode = listNode;
            }
        }

        ListNode4 calListNode = S04.swapNodes(headNode, k);

        while (calListNode != null) {
            System.out.print(calListNode.val + " ");
            calListNode = calListNode.next;
        }
    }

}
