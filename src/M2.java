import helpers.ListNode;

public class M2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (l1 != null) {
            sb1.insert(0, l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            sb2.insert(0, l2.val);
            l2 = l2.next;
        }

        long n1 = Long.parseLong(sb1.toString());
        long n2 = Long.parseLong(sb2.toString());

        String sumStr = String.valueOf(n1 + n2);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = sumStr.length() - 1; i >= 0; i--) {
            curr.next = new ListNode((int) Long.parseLong(String.valueOf(sumStr.charAt(i))));
            curr = curr.next;
        }

        return dummy.next;
    }

}
