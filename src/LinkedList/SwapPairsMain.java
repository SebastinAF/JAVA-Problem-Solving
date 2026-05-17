package LinkedList;

class ListNode3 {
    int val;
    ListNode3 next;
    ListNode3() {}
    ListNode3(int val) { this.val = val; }
    ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
}

class Solution03 {
    public ListNode3 swapPairs(ListNode3 head) {

        ListNode3 temp = head;

        while (temp != null) {
            if (temp.next != null) {
                int tempVal = temp.val;
                temp.val = temp.next.val;
                temp.next.val = tempVal;

                if (temp.next.next != null) {
                  temp = temp.next.next;
                  continue;
                }
            }
            temp = temp.next;
        }

        return head;
    }
}

public class SwapPairsMain {

    public static void main(String[] args) {

        Solution03 S03 = new Solution03();

        int[] arr = {1,2,3,4};

        ListNode3 head = null, newNode = null;
        ListNode3 list;

        for (int value : arr) {
            if (head == null) {
                list = new ListNode3(value);
                head = newNode = list;
            } else {
                list = new ListNode3(value);
                newNode.next = list;
                newNode = list;
            }
        }

        ListNode3 result = S03.swapPairs(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
