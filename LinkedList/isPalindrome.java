//problem Link:- https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        current = head;
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }
        current = reverse(current);
        while (current != null) {
            if (current.val != head.val) {
                return false;
            }
            head = head.next;
            current = current.next;
        }
        return true;
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