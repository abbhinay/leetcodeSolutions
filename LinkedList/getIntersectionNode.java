//problem Link:- https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }
        ListNode B = headB;
        while (headA != null) {
            headB = B;
            while (headB != null) {
                if (headB == headA) {
                    return headB;
                }
                headB = headB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}