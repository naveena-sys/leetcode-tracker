// Last updated: 7/11/2026, 2:05:22 PM
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; 
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
