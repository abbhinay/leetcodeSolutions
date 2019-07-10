//problem Link:- https://leetcode.com/problems/next-greater-node-in-linked-list/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class nextLargerNodes {
    public int[] nextLargerNodes(ListNode head) {
        ListNode current = head;
        int count = 1;
        while (current != null) {
            current = current.next;
            count++;
        }
        int[] arr = new int[count - 1];

        current = head;
        count = 0;
        int no = 0;
        while (current != null) {
            ListNode iterator = current.next;
            no = current.val;
            while (iterator != null) {
                if (iterator.val > no) {
                    no = iterator.val;
                    break;
                }
                iterator = iterator.next;
            }
            if (no == current.val) {
                arr[count++] = 0;
            } else {
                arr[count++] = no;
            }
            current = current.next;
        }
        return arr;
    }
}