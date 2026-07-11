// Last updated: 7/11/2026, 2:06:35 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        // Example input: 1 → 1 → 2 → 3 → 3
        // After removing duplicates: 1 → 2 → 3
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Found duplicate:
                // For example, current.val = 1, current.next.val = 1
                // Skip the next node by pointing current.next to next.next
                current.next = current.next.next;
                // List changes: 1 → 2 → 3 → 3 (the duplicate '1' removed)
            } else {
                // Move to next node if no duplicate
                current = current.next;
            }
        }
        
        return head;
    }
}
