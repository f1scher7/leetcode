import helpers.ListNode;

public class M92 {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode preLeft = dummy;
        ListNode currNode = head;

        for (int i = 0; i < left - 1; i++) {
            preLeft = preLeft.next;
            currNode = currNode.next;
        }

        ListNode subListHead = currNode;
        ListNode prevNode = null;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        preLeft.next = prevNode;
        subListHead.next = currNode;

        return dummy.next;
    }

}
