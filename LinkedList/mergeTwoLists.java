//problem Link:- https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode newNode = new ListNode(l1.val);
                newNode.next = head;
                head = newNode;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                ListNode newNode = new ListNode(l2.val);
                newNode.next = head;
                head = newNode;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            while (l2 != null) {
                ListNode newNode = new ListNode(l2.val);
                newNode.next = head;
                head = newNode;
                l2 = l2.next;
            }
        } else if (l2 == null) {
            while (l1 != null) {
                ListNode newNode = new ListNode(l1.val);
                newNode.next = head;
                head = newNode;
                l1 = l1.next;
            }
        }
        head = reverse(head);
        return head.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}