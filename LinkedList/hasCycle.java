//problem Link:- https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        boolean check = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.val == fast.val) {
                check = true;
                return check;
            }
        }
        return check;
    }
}