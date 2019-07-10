//problem Link:- https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        int carry = 0;
        while (l1 != null && l2 != null) {
            if (l1.val + l2.val + carry > 10) {
                ListNode newNode = new ListNode((l1.val + l2.val + carry) % 10);
                newNode.next = head;
                head = newNode;
                if (carry != 1) {
                    carry++;
                }
            } else if (l1.val + l2.val + carry == 10) {
                ListNode newNode = new ListNode(0);
                newNode.next = head;
                head = newNode;
                if (carry != 1) {
                    carry++;
                }
            } else {
                ListNode newNode = new ListNode(l1.val + l2.val + carry);
                newNode.next = head;
                head = newNode;
                if (carry != 0) {
                    carry--;
                }
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (carry == 1 && l1 == null && l2 == null) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
            carry--;
        }

        if (l1 == null) {
            while (l2 != null) {
                if (l2.val + carry > 9) {
                    ListNode newNode = new ListNode(0);
                    newNode.next = head;
                    head = newNode;
                    l2 = l2.next;
                } else {
                    ListNode newNode = new ListNode(l2.val + carry);
                    newNode.next = head;
                    head = newNode;
                    l2 = l2.next;
                    if (carry != 0) {
                        carry--;
                    }
                }
            }
        } else if (l2 == null) {
            while (l1 != null) {
                if (l1.val + carry > 9) {
                    ListNode newNode = new ListNode(0);
                    newNode.next = head;
                    head = newNode;
                    l1 = l1.next;
                } else {
                    ListNode newNode = new ListNode(l1.val + carry);
                    newNode.next = head;
                    head = newNode;
                    l1 = l1.next;
                    if (carry != 0) {
                        carry--;
                    }
                }
            }
        }

        if (carry == 1) {
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
            carry--;
        }
        return reverse(head).next;

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
