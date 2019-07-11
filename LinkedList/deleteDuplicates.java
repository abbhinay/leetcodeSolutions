//problem Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode temp = head;
        while (current != null) {
            ListNode current2 = current.next;
            while (current2 != null) {
                if (current2.val == current.val) {
                    temp.next = current2.next;
                } else {
                    temp = current2;
                }
                current2 = current2.next;
            }
            current = current.next;
            temp = current;
        }
        return head;
    }
}