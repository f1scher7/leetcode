import helpers.ListNode;

public class E206 {

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head = prevNode;

        return head;
    }

}
