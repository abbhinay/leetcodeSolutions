//problem Link:- https://leetcode.com/problems/add-two-numbers-ii/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class SoladdTwoNumbers2ution {
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode head;
        if (l1.val + l2.val + carry > 9) {
            head = new ListNode((l1.val + l2.val + carry) % 10);
            carry = 1;
        } else {
            head = new ListNode(l1.val + l2.val + carry);
            carry = 0;
        }
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            if (l1.val + l2.val + carry > 9) {
                ListNode newNode = new ListNode((l1.val + l2.val + carry) % 10);
                newNode.next = head;
                head = newNode;
                carry = 1;
            } else {
                ListNode newNode = new ListNode(l1.val + l2.val + carry);
                newNode.next = head;
                head = newNode;
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                if (l2.val + carry > 9) {
                    ListNode newNode = new ListNode((l2.val + carry) % 10);
                    newNode.next = head;
                    head = newNode;
                    carry = 1;
                } else {
                    ListNode newNode = new ListNode(l2.val + carry);
                    newNode.next = head;
                    head = newNode;
                    carry = 0;
                }
                l2 = l2.next;
            }
        } else if (l2 == null) {
            while (l1 != null) {
                if (l1.val + carry > 9) {
                    ListNode newNode = new ListNode((l1.val + carry) % 10);
                    newNode.next = head;
                    head = newNode;
                    carry = 1;
                } else {
                    ListNode newNode = new ListNode(l1.val + carry);
                    newNode.next = head;
                    head = newNode;
                    carry = 0;
                }
                l1 = l1.next;
            }
        }
        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
            carry = 0;
        }
        return head;
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