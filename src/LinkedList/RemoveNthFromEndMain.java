package LinkedList;

class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) {
        this.val = val;
    }
    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution02 {
    public ListNode2 removeNthFromEnd(ListNode2 head, int n) {

        int length = 0;
        ListNode2 temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        if (length == 1) {
            return null;
        }

        int upToLen = length - n;
        ListNode2 temp2 = head;
        if (upToLen == 0) return head = head.next;
        if (upToLen + 1 < length) {
            int i = 1;
            while (i < upToLen) {
                temp2 = temp2.next;
                i++;
            }

            temp2.next = temp2.next.next;
        } else {
            int i = 1;
            while (i < upToLen) {
                temp2 = temp2.next;
                i++;
            }

            temp2.next = null;
        }

        return head;
    }
}

public class RemoveNthFromEndMain {

    public static void main(String[] args) {
        Solution02 S02 = new Solution02();

        int[] arr = {1};

        ListNode2 head = null, newNode = null;
        for (int i : arr) {
            if (head == null) {
                ListNode2 list = new ListNode2(i);
                head = newNode = list;
            } else {
                ListNode2 list = new ListNode2(i);
                newNode.next = list;
                newNode = list;
            }
        }

        ListNode2 headAddress = S02.removeNthFromEnd( head, 1);

        while (headAddress != null) {
            System.out.println(headAddress.val);
            headAddress = headAddress.next;
        }
    }
}
