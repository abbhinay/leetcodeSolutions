//problem Link:- https://leetcode.com/problems/remove-linked-list-elements/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        if (val == head.val) {
            head = head.next;
            return removeElements(head, val);
        }

        ListNode current = head;
        while (current.next != null && current.next.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        if (current.next != null && current.next.val == val) {
            current.next = null;
        }
        return head;
    }

}