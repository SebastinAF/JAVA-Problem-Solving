package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null, newNode = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);

            if (head == null) {
                head = newNode = node;
            } else {
                newNode.next = node;
                newNode = node;
            }
        }

        return head;
    }
}

public class AddTwoNumbersMain {

    public static void main(String[] args) {
        Solution01 S01 = new Solution01();

        ListNode headNode = null, headNode2 = null, newNode = null, newNode2 = null;

        int[] a = {9,9,9,9,9,9,9}, b = {9,9,9,9};

        for (int i : a) {
            if (headNode == null && newNode == null) {
                headNode = newNode = new ListNode(i);
            } else {
                ListNode listNode = new ListNode(i);
                newNode.next = listNode;
                newNode = listNode;
            }
        }

        for (int i : b) {
            if (headNode2 == null && newNode2 == null) {
                headNode2 = newNode2 = new ListNode(i);
            } else {
                ListNode listNode = new ListNode(i);
                newNode2.next = listNode;
                newNode2 = listNode;
            }
        }

        ListNode calListNode = S01.addTwoNumbers(headNode, headNode2);

        while (calListNode != null) {
            System.out.print(calListNode.val + " ");
            calListNode = calListNode.next;
        }
    }
}
