//problem Link:- https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class middleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slowIterator = head;
        ListNode fastIterator = head;
        while (fastIterator != null && fastIterator.next != null) {
            slowIterator = slowIterator.next;
            fastIterator = fastIterator.next.next;
        }
        return slowIterator;
    }
}